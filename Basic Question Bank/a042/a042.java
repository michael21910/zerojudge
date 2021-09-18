import java.util.Scanner;

public class a042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(n * n - n + 2);
        }
        sc.close();
    }
}
