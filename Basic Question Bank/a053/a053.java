import java.util.Scanner;

public class a053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt();
            if(num <= 10) {
                System.out.println(num * 6);
            }
            else if(num <= 20) {
                System.out.println(60 + (num - 10) * 2);
            }
            else if(num <= 40) {
                System.out.println(80 + (num - 20));
            }
            else {
                System.out.println("100");
            }
        }
        sc.close();
    }
}
