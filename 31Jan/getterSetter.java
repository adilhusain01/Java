class Demo{
    public int x;
    private int y, z;

    private void setter(int a, int b, int c){
        this.x = a;
        this.y = b;
        this.z = c;
    }

    public void set(int a, int b, int c){
        this.setter(a, b, c);
    }

    public int getter(){
        return this.x + this.y + this.z;
    }
}

public class getterSetter {
    public static void main(String[] args) {
        Demo obj1 = new Demo();

        obj1.set(100, 200, 300);
        System.out.println(obj1.getter());
    }
}
