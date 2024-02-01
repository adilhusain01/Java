import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char gender = in.next().charAt(0);
        int age = in.nextInt();

        if(gender == 'M'){
            if(age>=18 && age<30){
                System.out.println("Can Vote");
            }else {
                System.out.println("Sorry");
            }
        }else if(gender == 'F'){
            if(age>=16){
                System.out.println("Can Vote");
            }else{
                System.out.println("Sorry");
            }
        }else{
            System.out.println("Wrong gender input");
        }

        in.close();
}
}
