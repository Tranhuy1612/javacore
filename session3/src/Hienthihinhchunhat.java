public class Hienthihinhchunhat {
    public static void main(String[] args) {
        int width = 5; // Chiều rộng của hình chữ nhật
        int height = 3; // Chiều cao của hình chữ nhật

        // Vòng lặp để hiển thị các hàng của hình chữ nhật
        for (int i = 0; i < height; i++) {
            // Vòng lặp để hiển thị các ký tự trong mỗi hàng
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println(); // Xuống dòng sau khi hiển thị một hàng
        }
    }
}
