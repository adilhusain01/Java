//To get the input

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //in is the object of the scanner class
    Scanner input = new Scanner(System.in);

    int x = input.nextInt();
    int y = input.nextInt();
    input.nextLine();
    String z = input.nextLine();

    int sum = x+y;
    System.out.println(sum);
    System.out.println(z);
    }
}