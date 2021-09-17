import java.util.Scanner;

public class a004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int year = sc.nextInt();
            if(year % 4 == 0 & year % 100 != 0 | year % 400 == 0) {
                System.out.println("閏年");
            }
            else {
                System.out.println("平年");
            }
        }
        sc.close();
    }
}
