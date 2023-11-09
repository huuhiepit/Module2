package Practice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: "); float a = scanner.nextFloat();
        System.out.println("b: "); float b = scanner.nextFloat();
        System.out.println("c: "); float c = scanner.nextFloat();

        float x;
        if(a != 0) {
            x = (c - b) / a;
            System.out.printf("Equation pass with: x = %f!\n", x);
        } else {
            if(b == c) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!!");
            }
        }

    }
}
