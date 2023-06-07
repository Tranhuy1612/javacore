public class Hienthihinhtamgiac {
    public static void main(String[] args) {
        int height = 5; // Chiều cao của tam giác

        // Vòng lặp để hiển thị các hàng của tam giác
        for (int i = 0; i < height; i++) {
            // Vòng lặp để hiển thị các ký tự '*' trong mỗi hàng
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Xuống dòng sau khi hiển thị một hàng
        }
    }
}
