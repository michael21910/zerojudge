import java.util.Scanner;

public class a148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt(), sum = 0;
            for(int i = 0; i < num; i++) {
                sum += sc.nextInt();
            }
            if(sum > 59 * num) {
                System.out.println("no");
            }
            else {
                System.out.println("yes");
            }
        }
        sc.close();
    }
}
