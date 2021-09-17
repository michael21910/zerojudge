import java.util.Scanner;

public class a006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int D = ((int)Math.pow(b, 2)) - 4 * a * c;
        if(D < 0) {
            System.out.println("No real root");
        }
        else if(D == 0) {
            System.out.println("Two same roots x=" + -b / (2 * a));
        }
        else {
            System.out.println("Two different roots x1=" + (-b + (int)Math.sqrt(D)) / (2 * a) + " , x2=" + (-b - (int)Math.sqrt(D)) / (2 * a));
        }
        sc.close();
    }
}
