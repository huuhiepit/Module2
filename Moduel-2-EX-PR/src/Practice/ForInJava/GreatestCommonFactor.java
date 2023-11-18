package Practice.ForInJava;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b = input.nextInt();

        a = Math.abs(a); b = Math.abs(b);

        if(a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }

        while (a != b) {
            if(a > b) {
                a -= b;
            }else {
                b -= a;
            }
        }

        System.out.print("Greatest common factor: " + a);
    }
}
