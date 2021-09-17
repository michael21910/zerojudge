import java.util.Scanner;

public class a010 {

    // returns the count ex: this_func(8, 2) -> 3
    static int calculate_count_by_base(int number, int base) {
        int counter = 0;
        while(number % base == 0) {
            counter++;
            number /= base;
        }
        return counter;
    }

    // append a elementat the end of an array
    static int[] append(int arr[], int target) {
        int[] returning_array = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            returning_array[i] = arr[i];
        }
        returning_array[arr.length] = target;
        return returning_array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), temp = number;
        int[] info = new int[0];

        // let the base 2 first
        if(calculate_count_by_base(number, 2) > 0) {
            info = append(info, 2);
            info = append(info, calculate_count_by_base(number, 2));
            number /= Math.pow(2, calculate_count_by_base(number, 2));
        }

        // then do the rest, +=2 makes it faster
        for(int i = 3; i < (int)Math.sqrt(temp) + 1; i+=2) {
            if(calculate_count_by_base(number, i) > 0) {
                info = append(info, i);
                info = append(info, calculate_count_by_base(number, i));
                number /= Math.pow(i, calculate_count_by_base(number, i));
            }
        }
        if(number > 1) {
            info = append(info, number);
            info = append(info, 1);
        }

        // print
        boolean first_printed = false;
        for(int i = 0; i < info.length; i+=2) {
            if(!first_printed) {
                if(info[i + 1] > 1) {
                    System.out.print(info[i] + "^" + info[i + 1]);
                    first_printed = true;
                }
                else {
                    System.out.print(info[i]);
                    first_printed = true;
                }
            }
            else {
                if(info[i + 1] > 1) {
                    System.out.print(" * " + info[i] + "^" + info[i + 1]);
                }
                else {
                    System.out.print(" * " + info[i]);
                }
            }
        }

        sc.close();
    }
}
