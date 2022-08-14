package private_use;
public class PrivateUse {
    private int a;
    private int b;
    private PrivateUse(int a, int b){
        this.a = a;
        this.b = b;
    }
    static PrivateUse makePrivateUse(int a, int b){
        return new PrivateUse(a, b);
    }
    public void show(){
        System.out.println("=============="+a+"================="+b);
    }
    public static void main(String[] args){
        PrivateUse privateUse = PrivateUse.makePrivateUse(10,20);
        privateUse.show();
    }
}
