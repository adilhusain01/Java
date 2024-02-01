//To get the input

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //in is the object of the scanner class
    Scanner in = new Scanner(System.in);

    int x = in.nextInt();
    int y = in.nextInt();
    in.nextLine();
    String z = in.nextLine();

    int sum = x+y;
    System.out.println(sum);
    System.out.println(z);

    in.close();
    }
}