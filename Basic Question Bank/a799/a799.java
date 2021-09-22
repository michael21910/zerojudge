import java.util.Scanner;

public class a799 {

    static long abs(long n) {
        return (n < 0 ? -n : n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.print(abs(num) + "\n");
        sc.close();
    }
}
