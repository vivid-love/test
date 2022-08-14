package private_use;
class AA{
    private void g(){
        System.out.println("this is AA!");

    }
    public final void f(){
        System.out.println("this is AA!");
    }
}
class BB extends AA{
    private void g(){
        System.out.println("this is BB!");

    }


}
public class PrivateAndFinal extends BB {
    private void g(){
        System.out.println("this is PrivateAndFinal!");
    }
    public static void main(String[] args){
        PrivateAndFinal privateAndFinal = new PrivateAndFinal();
        privateAndFinal.g();
        PrivateAndFinal privateAndFinal2 = privateAndFinal;
        privateAndFinal2.g();
        BB bb1 = privateAndFinal;
        bb1.f();

    }
}
