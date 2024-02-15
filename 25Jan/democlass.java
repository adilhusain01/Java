class Demo{
    public int x;
    public int y;

    public Demo() { 
        System.out.println("default");
    }
    
    public Demo(int x, int y) { 
        this.x = x;
        this.y = y;
        System.out.println("made one");
    }
}

public class democlass {
    public static void main(String[] args) {

        //default constructor called 2 times
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.x = 100;
        obj1.y = 200;
        obj2.x = 300;
        obj2.y = 400;
        
        System.out.println(obj1.x);
        System.out.println(obj1.y);
        System.out.println(obj2.x);
        System.out.println(obj2.y);

        //our own constructor called one time
        Demo obj3 = new Demo(500, 600);
        System.out.println(obj3.x);
        System.out.println(obj3.y);

    }
}
