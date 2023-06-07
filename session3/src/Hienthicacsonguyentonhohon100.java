public class Hienthicacsonguyentonhohon100 {
    public static void main(String[] args) {
        int limit = 100;
        System.out.println("Prime numbers smaller than " + limit + ":");

        for (int number = 2; number < limit; number++) {
            boolean isPrime = true;

            // Kiểm tra xem số hiện tại có chia hết cho bất kỳ số nào từ 2 đến căn bậc hai của nó hay không
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Nếu số là số nguyên tố, hiển thị nó
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
