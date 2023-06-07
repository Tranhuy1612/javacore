public class clolum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int columnToSum = 2; // Cột cần tính tổng (đếm từ 0)

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (columnToSum < matrix[i].length) {
                sum += matrix[i][columnToSum];
            }
        }
        System.out.println("Tổng các số trong cột " + columnToSum + " là: " + sum);
    }

}
