import java.util.Scanner;

public class a003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(), day = sc.nextInt();
        sc.close();
        int target = (month * 2 + day) % 3;
        if(target == 0) {
            System.out.println("普通");
        }
        else if(target == 1) {
            System.out.println("吉");
        }
        else {
            System.out.println("大吉");
        }
    }
}
