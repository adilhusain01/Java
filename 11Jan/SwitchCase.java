import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int sum = x+y;

        switch (sum) {
            case 10:
                System.out.println("10");
                break;
            case 12:
                System.out.println("12");
                break;
            default:
                System.out.println("We dont know");
                break;
        }

        in.close();
    }
}
