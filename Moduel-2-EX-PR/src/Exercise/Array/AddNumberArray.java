package Exercise.Array;

import java.util.Arrays;
import java.util.Scanner;

public class AddNumberArray {
    public static void main(String[] args) {
        int[] nums = {10, 4, 6, 7, 8, 0, 0, 0};
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so can them: ");
        int number = input.nextInt();
        System.out.print("Nhap vi tri can them vao: ");
        int index = input.nextInt();
        if(index < 0 || index > nums.length - 1) {
            System.out.println("Vi tri khong hop le");
        } else {
            for(int i = nums.length - 1; i > index; i--) {
                nums[i] = nums[i - 1];
            }
            nums[index] = number;
        }
        System.out.println(Arrays.toString(nums));
    }
}
