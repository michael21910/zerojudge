import java.util.Scanner;

public class a020 {

    static int Alphabet2Integer(char ch) {
        if(ch == 'A') {
            return 10;
        }
        else if(ch == 'B') {
            return 11;
        }
        else if(ch == 'C') {
            return 12;
        }
        else if(ch == 'D') {
            return 13;
        }
        else if(ch == 'E') {
            return 14;
        }
        else if(ch == 'F') {
            return 15;
        }
        else if(ch == 'G') {
            return 16;
        }
        else if(ch == 'H') {
            return 17;
        }
        else if(ch == 'I') {
            return 34;
        }
        else if(ch == 'J') {
            return 18;
        }
        else if(ch == 'K') {
            return 19;
        }
        else if(ch == 'L') {
            return 20;
        }
        else if(ch == 'M') {
            return 21;
        }
        else if(ch == 'N') {
            return 22;
        }
        else if(ch == 'O') {
            return 35;
        }
        else if(ch == 'P') {
            return 23;
        }
        else if(ch == 'Q') {
            return 24;
        }
        else if(ch == 'R') {
            return 25;
        }
        else if(ch == 'S') {
            return 26;
        }
        else if(ch == 'T') {
            return 27;
        }
        else if(ch == 'U') {
            return 28;
        }
        else if(ch == 'V') {
            return 29;
        }
        else if(ch == 'W') {
            return 32;
        }
        else if(ch == 'X') {
            return 30;
        }
        else if(ch == 'Y') {
            return 31;
        }
        return 33;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str_input = sc.nextLine();
            char[] str = str_input.toCharArray();
            int target = 0;
            for(int i = 0; i < 8; i++) {
                target += (8 - i) * (int)(str[i + 1] - '0');
            }
            target = target + (Alphabet2Integer(str[0]) / 10) + ((Alphabet2Integer(str[0]) % 10) * 9) + (int)(str[9] - '0');
            if(target % 10 == 0) {
                System.out.println("real");
            }
            else {
                System.out.println("fake");
            }
        }
        sc.close();
    }
}
