class A{
    public int x;
    public int y;
    public void fun(){
        System.out.println("Hello");
    }
}

class B extends A{
    public int z;
}

public class singleInheritance {
    public static void main(String[] args) {
        B obj1 = new B();

        obj1.x = 100;
        obj1.y = 200;
        obj1.fun();

        obj1.z = 300;

        System.out.println(obj1.x);
        System.out.println(obj1.y);
        System.out.println(obj1.z);
    }
}
