package inheritance_and_initialized;
class  Insect{
    private int i = 9;
    protected int j ;
    Insect(){
        System.out.println("i = "+i+", j = "+j);
        j =51;
    }
    private static int x1 = PrintInit("this is static inset.x1 initialized!");
    public static int  PrintInit(String s){
        System.out.println(s);
        return 47;
    }
}

public class InheritanceAndInitialized extends Insect{
    private int k = PrintInit(" this is  static k Inheritance_And_Initialized initialized!");
    public InheritanceAndInitialized(){
        System.out.println("k = "+k);
        System.out.println("j = "+j);

    }
    private static int x2 = PrintInit("this is static inset.x2 initialized!");
    public static void main(String[] args){
        System.out.println("start task!");
        InheritanceAndInitialized inheritanceAndInitialized = new InheritanceAndInitialized();

    }
}
