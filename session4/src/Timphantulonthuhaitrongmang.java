public class Timphantulonthuhaitrongmang {
    public static void main(String[] args) {
        // Mảng số nguyên
        int[] arr = {5, 2, 9, 1, 13, 3};

        // Giả định giá trị lớn nhất và lớn thứ hai ban đầu là phần tử đầu tiên trong mảng
        int max1 = arr[0];
        int max2 = arr[0];

        // Tìm giá trị lớn thứ hai trong mảng
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        // In giá trị lớn thứ hai
        System.out.println("Giá trị lớn thứ hai trong mảng là: " + max2);
    }
}
