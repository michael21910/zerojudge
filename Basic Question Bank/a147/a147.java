import java.util.Scanner;

public class a147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt();
            for(int i = 1; i < num; i++) {
                if(i % 7 == 0) {
                    continue;
                }
                else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
