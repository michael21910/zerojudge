import java.util.Scanner;

public class a001 {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        try {
            System.out.println("hello, " + string.nextLine());
        }
        finally {
            string.close();
        }
    }
}