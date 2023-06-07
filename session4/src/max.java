public class max {
    public static void main(String[] args) {
        int[][] arr = {
                {6, 2, 54},
                {4, 3, 24},
                {45, 8, 23}
        };

        int maxElement = arr[0][0]; // Giả sử phần tử đầu tiên là lớn nhất

        // Duyệt qua từng hàng và cột của mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxElement) {
                    maxElement = arr[i][j]; // Cập nhật giá trị lớn nhất
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng là: " + maxElement);
    }
}
