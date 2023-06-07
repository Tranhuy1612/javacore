public class Themphantumoivaomang {
    public static void main(String[] args) {
        // Mảng ban đầu
        int[] arr = {1, 2, 3, 4, 5};

        // Kích thước mới của mảng
        int newSize = arr.length + 1;

        // Tạo mảng mới với kích thước mới
        int[] newArr = new int[newSize];

        // Sao chép các phần tử từ mảng ban đầu sang mảng mới
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // Giá trị mới cần thêm vào
        int newValue = 8;

        // Gán giá trị mới vào phần tử cuối cùng của mảng mới
        newArr[newSize - 1] = newValue;

        // Cập nhật biến tham chiếu của mảng ban đầu
        arr = newArr;

        // In ra mảng sau khi thêm phần tử mới
        System.out.println("Mảng sau khi thêm phần tử mới:");
        for (int element : arr) {
            System.out.print(element + " ");
        }

    }
}
