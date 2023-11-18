package Practice.Array;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean isExits = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String name = input.nextLine();
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is: " + i);
                isExits = true;
                break;
            }
        }
        if(!isExits) {
            System.out.println("Not found " + name + " in the list.");
        }
    }

}
