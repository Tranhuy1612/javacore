public class Hienthitamgiaccan {
    public static void main(String[] args) {
        int height = 5; // Chiều cao của tam giác
        int spaces = height - 1; // Số khoảng trống cần hiển thị trước mỗi dòng
        int stars = 1; // Số ký tự '*' cần hiển thị trên mỗi dòng

        // Vòng lặp để hiển thị các hàng của tam giác
        for (int i = 0; i < height; i++) {
            // Hiển thị khoảng trống trước mỗi dòng
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Hiển thị ký tự '*' trên mỗi dòng
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println(); // Xuống dòng sau khi hiển thị một hàng

            spaces--; // Giảm số khoảng trống
            stars += 2; // Tăng số ký tự '*'
        }
    }
}
