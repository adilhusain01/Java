import java.util.Scanner;

class forLoop{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = in.nextInt();

        for(int i=1; i<10; ++i){
            if(i%2!=0){
                System.out.println(x + " * " + i + " = " + x*i);
            }
        }
    }
}