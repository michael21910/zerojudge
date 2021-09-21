import java.util.Scanner;

public class a244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i = 0; i < cases; i++) {
            long command = sc.nextInt(), num1 = sc.nextInt(), num2 = sc.nextInt();
            if(command == 1) {
                System.out.println(num1 + num2);
            }
            else if(command == 2) {
                System.out.println(num1 - num2);
            }
            else if(command == 3) {
                System.out.println(num1 * num2);
            }
            else {
                System.out.println(num1 / num2);
            }
        }
        sc.close();
    }
}
