package S1_HW;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Task1 {
    static String str;
    public static void main(String[] args) {

        // method1();
        // method2();
        method3();

    }

    public static void method1() {
        int[] arr = new int[] { 1, 2, 3 };
        System.out.println(arr[4]);
    }

    public static void method2() {
        System.out.println(4 / 0);
    }

    public static void method3() {
        String newStr = str.toUpperCase();
        System.out.println(newStr);
        }

}
