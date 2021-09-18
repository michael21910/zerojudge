import java.util.Scanner;

public class a044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt();
            System.out.println((num * num * num + num * 5) / 6 + 1);
        }

        sc.close();
    }
}
