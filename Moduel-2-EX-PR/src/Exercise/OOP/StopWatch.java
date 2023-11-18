package Exercise.OOP;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public  StopWatch() {
        startTime = LocalDateTime.now();
    }

    public void start() {
        startTime = LocalDateTime.now();
    }
    public void end() {
        endTime = LocalDateTime.now();
    }

    public long getEndTime() {
        return ChronoUnit.MILLIS.between(startTime, endTime);
    }

    public static void main(String[] args) {
        StopWatch st = new StopWatch();
        st.start();
        int[] nums = generateUnsortedArray(100000);
        sortSelection(nums);
        st.end();
        System.out.println("Mang da sap xep: " + Arrays.toString(nums));
        System.out.println("Thoi gian troi theo milisecond giay: " + st.getEndTime());
    }

    public static void sortSelection(int [] nums) {
        for(int i = 0; i < nums.length; i++) {
            int maxIndex = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[maxIndex] < nums[j]) {
                    maxIndex = j;
                }
            }
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static int[] generateUnsortedArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // You can adjust the upper bound as needed
        }

        return array;
    }
}
