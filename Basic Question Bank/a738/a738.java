import java.util.Scanner;

public class a738 {

    static long GCD(long n1, long n2) {
        while(n2 != 0) {
            long temp = n1;
            n1 = n2;
            n2 = temp % n2;
        }
        return n1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            long num1 = sc.nextLong(), num2 = sc.nextLong();
            System.out.print(GCD(num1, num2) + "\n");
        }
        sc.close();
    }    
}
