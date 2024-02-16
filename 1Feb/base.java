class Base{
    public int p;
    public int q;
    
    Base(int a, int b){
        this.p = a;
        this.q = b;
    }

    public void fun(){
        System.out.println("Hello");
    }
}

class Child extends Base{
    public int r;
    public int s;
    Child(int a, int b, int c, int d){
        //going to base class due to super keyword
        super(a, b);
        this.r = c;
        this.s = d;
    }

    public void smallFun(){
        super.fun();
    }
}

//both constcutors are called when an inherited class' object is created

public class base {
    public static void main(String[] args) {
        Child child1 = new Child(1, 2, 3, 4);

        System.out.println(child1.p + " " + child1.q + " " + child1.r + " " + child1.s);
        
        child1.smallFun();
    }
}
