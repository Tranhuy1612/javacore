import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // khai báo mảng
        int[] arrInt = {1, 2, 3, 4};
        int arrInt1[];
        System.out.println("mảng ban đầu" + Arrays.toString(arrInt));
        test(arrInt);
        System.out.println("mảng thay đổi " + Arrays.toString(arrInt));
    }

    public static void test(int[] arr) {
        arr[1] = 10;
    }
}