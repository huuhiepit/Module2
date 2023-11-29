package Practice.abstracts.comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted: ");
        printCircles(circles);

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        printCircles(circles);
    }

    public static void printCircles(ComparableCircle[] circles) {
        for(ComparableCircle circle: circles) {
            System.out.println(circle);
        }
    }
}
