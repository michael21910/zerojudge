import java.util.Scanner;

public class a040 {

    static int pow(int coef, int times) {
        int temp = coef;
        if(times == 0) {
            return 1;
        }
        for(int i = 0; i < times - 1; i++) {
            coef *= temp;
        }
        return coef;
    }

    static boolean isArmstrong(int number) {
        int digit = (((int)Math.log10(number)) + 1);
        int sum = 0;
        String target = String.valueOf(number);
        for(int i = 0; i < digit; i++) {
            sum += pow((int)(target.charAt(i) - '0'), digit);
        }
        return (sum == number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), counter = 0;
        for(int i = n; i < m; i++) {
            if(isArmstrong(i)) {
                System.out.print(i + " ");
                counter++;
            }
        }
        if(counter == 0) {
            System.out.println("none");
        }
        sc.close();
    }
}
