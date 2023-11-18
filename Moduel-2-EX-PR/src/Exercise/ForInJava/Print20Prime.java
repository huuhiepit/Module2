package Exercise.ForInJava;

public class Print20Prime {
    public static void main(String[] args) {
        System.out.println("20 so nguyen to dau tien");
        print20Prime();
        System.out.println("Cac so nguyen to nho hon 100");
        printPrimeLess100();
    }
    public static boolean isPrime(int number) {
        if(number < 2) return false;
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void print20Prime() {
        int count = 1;
        int i = 2;
        while (count != 20) {
            if(isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    public static void printPrimeLess100() {
        int i = 2;
        while (i < 100) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
