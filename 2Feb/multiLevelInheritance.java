class parent{
    int x;
}

class child extends parent{
    int y;
}

class grandChild extends child{
    int z;
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        grandChild obj1 = new grandChild();

        obj1.z=100;

        System.out.println(obj1.z);
    }
}
