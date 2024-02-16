class Demo{
    public int x;

    //This variable will be auto created at the compilation and not needed to be created as object of class first to alot memory
    //and its common to every object
    public static int y;
}

public class Static {
    public static void main(String[] args) {
        Demo.y = 100;

        Demo obj1 = new Demo();
        obj1.y = 200;
        System.out.println(Demo.y);
        System.out.println(obj1.y);
    }
}