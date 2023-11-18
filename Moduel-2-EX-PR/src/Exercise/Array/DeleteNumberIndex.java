package Exercise.Array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteNumberIndex {
    public static void main(String[] args) {
        int[] nums = {10, 4, 6, 7, 8, 5, 1};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number remove: ");
        int number = input.nextInt();
        int index = findIndexDelete(number, nums);
        if(index != -1) {
            for(;index < nums.length - 1; index++) {
                nums[index] = nums[index + 1];
            }
            nums[nums.length - 1] = 0;
        } else {
            System.out.println("Khong tim thay so trong mang");
        }
        System.out.println("Arrray: " + Arrays.toString(nums));

    }
    public static int findIndexDelete(int number, int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
