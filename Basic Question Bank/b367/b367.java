import java.util.Scanner;

public class b367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(), t = 0;
        while(t++ < T) {
            int row = sc.nextInt(), col = sc.nextInt();
            int[] arr = new int[row * col];
            for(int i = 0; i < row * col; i++) {
                arr[i] = sc.nextInt();
            }
            boolean goForward = true;
            for(int i = 0; i < row * col; i++) {
                if(arr[i] != arr[row * col - 1 - i]) {
                    goForward = false;
                    break;
                }
            }
            if(goForward) {
                System.out.print("go forward\n");
            }
            else {
                System.out.print("keep defending\n");
            }
        }

        sc.close();
    }
}
