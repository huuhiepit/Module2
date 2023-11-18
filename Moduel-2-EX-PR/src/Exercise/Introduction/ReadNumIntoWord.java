package Exercise.Introduction;

import java.util.Scanner;

public class ReadNumIntoWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number need to read: ");
        int number = scanner.nextInt();

        System.out.println(convertToWord(number));
        scanner.close();
    }
    public static String convertToWord(int num) {
        if(num < 0 || num > 999) {
            return "Số không hợp lệ";
        }
        String[] ones = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {
                "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };
        if (num == 0) {
            return "Zero";
        }

        String words = "";
        if(num >= 100) {
            words += ones[num / 100] + " Hunderd ";
            num %= 100;
        }
        if(num >= 20) {
            words += tens[num / 10] + " ";
            num %= 10;
        }
        if(num > 0) {
            words += ones[num] + " ";
        }
        return words.trim();
    }
}
