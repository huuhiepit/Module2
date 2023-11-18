package Exercise.Array;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5};
        int[] nums2 = {2, 6, 3};
        int len1 = nums1.length;
        int len2 = nums2.length;
        int size = len1 + len2;

        int[] nums3 = new int[size];
        for(int i = 0; i < len1; i++) {
            nums3[i] = nums1[i];
        }
        for (int j = 0; j < len2; j++) {
            nums3[size - len2 + j] = nums2[j];
        }
        System.out.println(Arrays.toString(nums3));
    }
}
