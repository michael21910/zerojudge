import java.util.Scanner;

public class a034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println(Integer.toBinaryString(sc.nextInt()));
        }
        sc.close();
    }    
}
