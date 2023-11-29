package CodeGym.oop.lesson13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ManagerEmployees {
    public static void main(String[] args) {
        //String fullName, LocalDateTime birthDay, String phone, String email, String employee_Type
        List<Employee> employees = new ArrayList<>();
        employees.add(new Fresher("Nguyen Huu Hiep", LocalDate.of(2000, 1, 13), "0355482110", "hiep@gmail.com", "Fresher",LocalDate.of(2023, 5, 28), "Kha", "DHKH Hue"));
        employees.add(new Intern("Hoang Tuan", LocalDate.of(2001, 5, 12), "0357458941", "hoangTuan@gmail.com", "Intern", "CNTT", 3, "Bach Khoa DN"));
        employees.add(new Experience("My Dung", LocalDate.of(2002, 4, 12), "036684120", "mydung@gmail.com", "Experience", 2, "Data API"));

        for (Employee item: employees) {
            if(item instanceof Intern) {
                Fresher fh = (Fresher) item;
                fh.setGraduationDate(LocalDate.of(2023, 5, 28));
                fh.setGraduationRank("Gioi");
                fh.setEducation("BK HCM");
                System.out.println(fh.showInfo());
            }
            System.out.println(item.showInfo());
        }
    }
}
