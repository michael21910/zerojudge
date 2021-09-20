import java.util.Scanner;

public class a095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int crime = sc.nextInt(), red_hat = sc.nextInt();
            if(crime != red_hat) {
                System.out.println(red_hat + 1);
            }
            else {
                System.out.println(red_hat);
            }
        }

        sc.close();
    }
}
