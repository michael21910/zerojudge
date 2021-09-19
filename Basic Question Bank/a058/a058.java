import java.util.Scanner;

public class a058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), t = 0;
        int arr[] = new int[3];
        while(t++ < T) {
            int num = sc.nextInt();
            arr[num % 3]++;
        }
        System.out.print(arr[0] + " " + arr[1] + " " + arr[2]);
        sc.close();
    }
}
