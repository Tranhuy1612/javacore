import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char nhapvao = sc.next().charAt(0);
        String str = "nhapbatcuthugi";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (nhapvao == str.charAt(i)) {
                count++;
            }
        }
        System.out.printf("ký tự %c xuất hiện %d lần ở trong chuỗi %s", nhapvao, count, str);
    }
}

