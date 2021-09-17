import java.util.Scanner;

public class a015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int row = sc.nextInt(), col = sc.nextInt();
            int[][] matrix = new int[row][col];
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < col; i++) {
                for(int j = 0; j < row; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
