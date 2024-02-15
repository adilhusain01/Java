import java.util.*;

public class duplicatesTwo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();

        int matrix[][] = new int[rows][columns];

        int max = 0;
        for(int i=0; i<rows; ++i){
            for(int j=0; j<columns; ++j){
                matrix[i][j] = in.nextInt();
                if (matrix[i][j] > max) max = matrix[i][j];
            }
        }

        int arr[] = new int[max+1];

        for(int i=0; i<rows; ++i){
            for(int j=0; j<columns; ++j){
                arr[matrix[i][j]] = arr[matrix[i][j]] + 1;
            }
        }

        System.out.println();

        for(int i=0; i<arr.length; ++i){
            if(arr[i] == 2){
                System.out.println(i);
            }
        }

        in.close();
    }
}
