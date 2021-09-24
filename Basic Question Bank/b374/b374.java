import java.util.Scanner;

public class b374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counter = new int[30001];
        int nums = sc.nextInt();
        for(int i = 0; i < nums; i++) {
            int temp = sc.nextInt();
            counter[temp]++;
        }
        int maximum = 0;
        for(int i = 0; i < 30001; i++) {
            if(counter[i] > maximum) {
                maximum = counter[i];
            }
        }
        for(int i = 0; i < 30001; i++) {
            if(counter[i] == maximum) {
                System.out.print(i + " " + maximum + "\n");
            }
            else {
                continue;
            }
        }
        sc.close();
    }
}
