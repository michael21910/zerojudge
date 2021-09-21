import java.util.Scanner;

public class a216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt();
            long f = 1, g = 1;
            for(int i = 1; i < num; i++) {
                f += (i + 1);
                g += f;
            }
            System.out.println(f + " " + g);
        }
        sc.close();
    }
}
