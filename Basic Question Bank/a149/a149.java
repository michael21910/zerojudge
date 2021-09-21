import java.util.Scanner;

public class a149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), t = 0;
        while(t++ < T) {
            String num = sc.next();
            int output = (int)(num.charAt(0) - '0');
            for(int i = 1; i < num.length(); i++) {
                output = output * (int)(num.charAt(i) - '0');
            }
            System.out.println(output);
        }
        sc.close();
    }
}
