import java.util.Scanner;

public class a024 {

    static int GCD(int a, int b) {
        while(b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(GCD(num1, num2));

        sc.close();
    }
}
