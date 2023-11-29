package CodeGym.oop.manager_officers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManagerOfficers {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //String fullName, int age, String gender, String addRess
        Officer cb01 = new Employee("Nguyen Hoang", 20, "Nam", "Hue", "Tiep thi");
        Officer cb02 = new Worker("Nguyen Tuan", 22, "Nam", "Da Nang", 6);
        Officer cb03 = new Engineer("Dung Nhan", 19, "Nu", "TP HCM", "CNTT");

        ArrayList<Officer> officers = new ArrayList<>();
        officers.add(cb01);
        officers.add(cb02);
        officers.add(cb03);

        int choice = -1;
        do {
            System.out.println("==================================Manager Officers==========================================");
            System.out.println("===                     1. Thêm cán bộ mới                                               ===");
            System.out.println("===                     2. Tìm kiếm theo họ tên                                          ===");
            System.out.println("===                     3. Hiển thị thông tin về danh sách cán bộ                        ===");
            System.out.println("===                     0. Thoát khỏi chương trình                                       ===");
            System.out.println("============================================================================================");
            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    int choiceStyle = 0;
                    System.out.println("==================================Chọn loại cán bộ muốn thêm================================");
                    System.out.println("===                         1. Thêm một nhân viên                                        ===");
                    System.out.println("===                         2. Thêm một công nhân                                        ===");
                    System.out.println("===                         3. Thêm một kỹ sư                                            ===");
                    System.out.println("===                         Khác. Thêm một cán bộ chưa xác định                          ===");
                    System.out.println("============================================================================================");
                    System.out.print("Nhập lựa chọn: ");
                    choiceStyle = Integer.parseInt(input.nextLine());
                    switch (choiceStyle) {
                        case 1:
                            officers.add(addOfficer(1));
                            break;
                        case 2:
                            officers.add(addOfficer(2));
                            break;
                        case 3:
                            officers.add(addOfficer(3));
                            break;
                        default:
                            officers.add(addOfficer(0));
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Nhập tên bạn muốn tìm kiếm: ");
                    String search = input.nextLine();
                    displayOfficers(searchName(officers ,search));
                    break;
                case 3:
                    displayOfficers(officers);
                    break;
                default:
                    choice = 0;
                    break;
            }
        } while (choice != 0);
    }

    public static void displayOfficers(ArrayList<Officer> officers) {
        System.out.println("==================================Manager Officers==========================================");
        System.out.printf("%20s %10s %10s %10s %20s \n", "Full Name", "Age", "Gender", "Address", "Other");
        for(Officer officer : officers) {
            System.out.println(officer.toString());
        }
        System.out.println("============================================================================================");
    }

    public static Officer addOfficer(int style) {
        System.out.println("========= Thêm một cán bộ =========");

        System.out.print("Nhập họ và tên: ");
        String fullName = input.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(input.nextLine());

        System.out.print("Nhập giới tính: ");
        String gender = input.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String addRess = input.nextLine();

        switch (style) {
            case 1:
                System.out.print("Nhập công việc: ");
                String job = input.nextLine();
                return new Employee(fullName, age, gender, addRess, job);
            case 2:
                System.out.print("Nhập cấp độ: ");
                int level = Integer.parseInt(input.nextLine());
                return new Worker(fullName, age, gender, addRess, level);
            case 3:
                System.out.print("Nhập ngành đào tạo: ");
                String specialized = input.nextLine();
                return new Engineer(fullName, age, gender, addRess, specialized);
            default:
                return new Officer(fullName, age, gender, addRess);
        }

    }

    public static ArrayList<Officer> searchName(ArrayList<Officer> officers, String searchName) {
        ArrayList<Officer> result;
        result = officers.stream().filter(officer -> officer.getFullName().contains(searchName)).collect(Collectors.toCollection(ArrayList::new));
        return result;
    }
}
