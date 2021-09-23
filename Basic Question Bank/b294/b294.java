import java.util.Scanner;

public class b294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int days = sc.nextInt(), sum = 0;
            for(int i = 0; i < days; i++) {
                int counter = sc.nextInt();
                sum += (i + 1) * counter;
            }       
            System.out.print(sum + "\n");
        }
        sc.close();
    }
}