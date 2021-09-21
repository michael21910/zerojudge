import java.util.Scanner;

public class a224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int[] counter = new int[26];
            for(int i = 0; i < 26; i++) {
                counter[i] = 0;
            }
            String input = sc.nextLine();
            input = input.toLowerCase();
            for(int i = 0; i < input.length(); i++) {
                if('a' <= input.charAt(i) & input.charAt(i) <= 'z') {
                    counter[input.charAt(i) - 'a']++;
                }
            }
            int oddCounter = 0;
            for(int i = 0; i < counter.length; i++) {
                if(counter[i] % 2 == 1) {
                    oddCounter++;
                }
            }
            if(oddCounter >= 2) {
                System.out.println("no...");
            }
            else {
                System.out.println("yes !");
            }
        }
        sc.close();
    } 
}
