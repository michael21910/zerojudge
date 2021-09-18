import java.util.Scanner;

public class a038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Integer.parseInt(new StringBuilder(sc.nextLine()).reverse().toString()));

        sc.close();
    }
}
