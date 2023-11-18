package Exercise.Introduction;

import java.util.Scanner;

public class ChangeCurrency {
    public static void main(String[] args) {
        double rate = 24000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD cần đổi sang tiền VND:  ");
        double usd = scanner.nextDouble();

        double vnd = usd * rate;
        System.out.printf("%.2f USD sang VND : %.2f", usd, vnd);
    }
}
