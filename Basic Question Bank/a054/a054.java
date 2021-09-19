import java.util.Scanner;

public class a054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] map = new String[]{"BNZ", "AMW", "KLY", "JVX", "HU", "GT", "FS", "ER", "DOQ", "CIP"};
        char[] arr = sc.nextLine().toCharArray();
        int sum = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            sum += ((int)(arr[i] - '0')) * (8 - i);
        }
        sum += (int)(arr[arr.length - 1] - '0');
        int target = (10 - (sum % 10)) % 10;
        System.out.println(map[target]);
        sc.close();
    }
}   