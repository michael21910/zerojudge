import java.util.Scanner;

public class a065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String output = "";
            String input = sc.nextLine();
            for(int i = 1; i < 7; i++) {
                output = output + Math.abs(input.charAt(i)- input.charAt(i - 1));
            }
            System.out.println(output);
        }
        sc.close();
    }
}
