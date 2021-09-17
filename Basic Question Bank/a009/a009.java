import java.util.Scanner;

public class a009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ascii = str.toCharArray();
        for(int i = 0; i < ascii.length; i++) {
            System.out.print((char)((int)ascii[i] - 7));
        }
        sc.close();
    }
}
