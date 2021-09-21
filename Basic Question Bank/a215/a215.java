import java.util.Scanner;

public class a215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt(), sum = sc.nextInt();
            int adding = num, counter = 1;
            while(sum >= adding) {
                adding += (++num);
                ++counter;
            }
            System.out.println(counter);
        }
        sc.close();
    }
}
