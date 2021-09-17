import java.util.Scanner;

public class a022 {

    static char[] lowerbound(char arr[]) {
        for(int i = 0; i < arr.length; i++) {
            if('A' <= arr[i] & arr[i] <= 'Z') {
                arr[i] = (char)((int)arr[i] - (int)('A') + (int)('a'));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] char_arr = str.toCharArray();
        char_arr = lowerbound(char_arr);

        boolean isPalindrome = true;
        for(int i = 0; i < (char_arr.length / 2) + 1; i++) {
            if(char_arr[i] != char_arr[char_arr.length - i - 1]) {
                isPalindrome = false;
                break;
            }
            else {
                continue;
            }
        }

        if(isPalindrome) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        sc.close();
    }
}
