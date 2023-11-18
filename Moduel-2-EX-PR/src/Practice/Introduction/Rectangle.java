package Practice.Introduction;

import java.util.Scanner;

public class Rectangle {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        float width;
        float height;

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
