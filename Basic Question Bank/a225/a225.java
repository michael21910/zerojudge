import java.util.Scanner;

public class a225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int count = sc.nextInt();
            int[] num = new int[count];
            for (int i = 0; i < count; i++) {
                num[i] = sc.nextInt();                    
            }
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count - 1; j++) {
                    if (num[j] % 10 > num[j + 1] % 10) {
                        int temp = num[j];
                        num[j] = num[j + 1];
                        num[j + 1] = temp;
                    }
                    if (num[j] % 10 == num[j + 1] % 10 & num[j] < num[j + 1]) {
                        int temp = num[j];
                        num[j] = num[j + 1];
                        num[j + 1] = temp;
                    }
                }
            }
            for(int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
