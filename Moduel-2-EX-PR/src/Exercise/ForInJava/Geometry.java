package Exercise.ForInJava;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice = -1;
        int len;

        Scanner input = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter length: ");
                    len = input.nextInt();
                    System.out.print("Enter weight: ");
                    int wei = input.nextInt();
                    printRetangle(len, wei);
                    break;
                case 2:
                    System.out.print("Enter corner: ");
                    input.nextLine();
                    String cor = input.nextLine();
                    printSquareTriangle(cor);
                    break;
                case 3:
                    System.out.print("Enter length: ");
                    len = input.nextInt();
                    printIsosceles(len);
                    break;
                case 0:
                    System.exit(0);
                default:
                    break;

            }
        }
    }

    public static void printRetangle(int len,int wei) {
        for(int i = 0; i < wei; i++) {
            String str = "";
            for(int j = 0; j < len; j++) {
                str += " * ";
            }
            System.out.println(str);
        }
    }
    public static void printSquareTriangle(String corner) {
        int i = 1;
        while(i <= 5) {
            String str = "";
            int j;
            if(corner.equals("bl")) {
                j = 0;
                while (j < i) {
                    str += " * ";
                    j++;
                }
            }
            if(corner.equals("tl")) {
                j = 5;
                while (j > i) {
                    str += " * ";
                    j--;
                }
            }
            System.out.println(str);
            i++;
        }

    }
    public static void printIsosceles(int len) {
        for(int i = 1; i <= len; i++) {
            String str = "";
            for(int j = 1; j <= len - i; j++) {
                str += "   ";
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                str += " * ";
            }
            System.out.println(str);
        }
    }
}
