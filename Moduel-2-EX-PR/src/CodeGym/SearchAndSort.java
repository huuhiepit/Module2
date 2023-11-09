package CodeGym;

public class SearchAndSort {
    public static void main(String[] args) {
        int[] nums = {1,3,4,6,7,9};
        System.out.println(binarySearch(nums, 4));
    }

    //Search
    public static int binarySearch(int[] nums, int num) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == num) {
                return mid;
            }
            if (nums[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                return i;
            }
        }
        return -1;
    }

    //Sort
    public static void bubbleSort(int[] nums) {
        boolean flag;
        for (int i = 0; i < nums.length - 1; i++) {
            flag = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[indexMin]) {
                    indexMin = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[indexMin];
            nums[indexMin] = temp;
        }
    }

    public static void interchangeSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
