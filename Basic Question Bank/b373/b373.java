import java.util.Scanner;

public class b373 {

    static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int[] arr = new int[nums];
        for(int i = 0; i < nums; i++) {
            arr[i] = sc.nextInt();
        }
        int counter = 0;
        for(int i = nums - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[i] < arr[j]) {
                    swap(arr[i], arr[j]);
                    counter++;
                }
            }
        }
        System.out.print(counter + "\n");
        sc.close();
    }
}
