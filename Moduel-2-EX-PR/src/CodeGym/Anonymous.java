package CodeGym;

interface MyInterface {
    void doSomething();
}

public class Anonymous {
    public static void main(String[] args) {
        // Sử dụng anonymous class để triển khai interface MyInterface
        MyInterface myInterface = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("Doing something in anonymous class.");
            }
        };

        // Gọi phương thức từ interface thông qua đối tượng anonymous class
        myInterface.doSomething();
    }
}
