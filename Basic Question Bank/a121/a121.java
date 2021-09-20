import java.util.Scanner;

public class a121 {

    static int isPrime(int num) {
        for(int i = 3; i <= ((int)(Math.sqrt(num - 1)) + 1); i+=2) {
            if(num % i == 0) {
                return 0;
            }
            else {
                continue;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()) {
            int num1 = sc.nextInt(), num2 = sc.nextInt(), sum = 0;
            for(int i = num1; i <= num2; i++) {
                if(i == 2) {
                    sum++;
                }
                else if(i % 2 == 0 | i == 1) {
                    continue;
                }
                else {
                    sum += isPrime(i);
                }
            }
            System.out.println(sum);
        }

        sc.close();
    }
}
