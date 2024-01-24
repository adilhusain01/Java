import java.io.*;

public class Array {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 7, 4, 6, 5, 1, 9, 1 };
        for (int i = 0; i < 9; ++i) {
            for (int j = i + 1; j < 9; ++j) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}