import java.util.Scanner;

public class a005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while(cases > 0) {
            int[] arr = new int[4];
            for(int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
                System.out.print(arr[i] + " ");
            }
            if(arr[2] + arr[1] - arr[0] == arr[3]) {
                System.out.println(arr[3] + arr[1] - arr[0]);
            }
            else {
                System.out.println(arr[3] * (arr[1] / arr[0]));
            }
            cases--;
        }
        sc.close();
    }
}
