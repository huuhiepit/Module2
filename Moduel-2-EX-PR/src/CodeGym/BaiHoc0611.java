package CodeGym;

public class BaiHoc0611 {
    public static void main(String[] args) {
        int [] nums = {1, 5, 9, 11, 0, 4, 6, 12};
        /**
         * Tim so lon nhat trong mang
         * Tim so lon thu hai trong mang
         * Tim so chan dau tien trong mang
         * Tinh tong cac so chan trong mang
         */
        System.out.println("Max:" + findMax(nums));
        System.out.println("Second max: " + findSecondMax(nums));
        System.out.println("Even number first: " + findIndexEven(nums));
        System.out.println("Total even number in array: " + totalEven(nums));

    }
    public static void printArray(int [] numbers) {
        for(int number : numbers) {
            System.out.println(number);
        }
    }

    public static int findMax(int [] numbers) {
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return  max;
    }

    public  static int findSecondMax(int [] numbers) {
        int secondMax;
        int max = findMax(numbers);
        if(numbers[0] != max) {
            secondMax = numbers[0];
        } else {
            secondMax = numbers[1];
        }
        for(int i = 1; i < numbers.length; i++) {
            if(secondMax < numbers[i] && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        return secondMax;
    }

    public static int findIndexEven(int [] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int totalEven(int [] numbers) {
        int total = 0;
        for(int number : numbers) {
            if(number % 2 == 0) {
                total += number;
            }
        }
        return total;
    }
}
