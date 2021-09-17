import java.math.BigInteger;
import java.util.Scanner;

public class a021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.next();
            String command = sc.next();
            String str2 = sc.next();
            BigInteger num1 = new BigInteger(str1);
            BigInteger num2 = new BigInteger(str2);
            if(command.equals("+")) {
                System.out.println(num1.add(num2));
            }
            else if(command.equals("-")) {
                System.out.println(num1.subtract(num2));
            }
            else if(command.equals("*")) {
                System.out.println(num1.multiply(num2));
            }
            else if(command.equals("/")) {
                System.out.println(num1.divide(num2));
            }
        }
        sc.close();
    }
}
