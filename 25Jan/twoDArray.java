import java.util.*;

public class twoDArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();

        int matrix[][] = new int[rows][columns];

        for(int i=0; i<rows; ++i){
            for(int j=0; j<columns; ++j){
                matrix[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<rows; ++i){
            for(int j=0; j<columns; ++j){
                System.out.print(matrix[i][j]);
            }
            System.out.print('\n');
        }

        in.close();
    }
}
