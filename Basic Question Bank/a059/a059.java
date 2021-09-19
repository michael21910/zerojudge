import java.util.Scanner;

public class a059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), t = 0;
        while(t++ < T) {
            int num1 = sc.nextInt(), num2 = sc.nextInt(), sum = 0;
            for(int i = num1; i <= num2; i++) {
                if(((int)(Math.sqrt(i)) == (Math.sqrt(i)))) {
                    sum += i;
                }
            }
            System.out.println("Case " + t + ": " + sum);
        }
        sc.close();
    }
}
