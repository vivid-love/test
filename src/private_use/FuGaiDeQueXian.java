package private_use;


public class FuGaiDeQueXian {
    private void f(){System.out.println("private f()!");}
    final private  void g(){};
    public static void main(String[] args){
        FuGaiDeQueXian fuGaiDeQueXian = new Derived();
        fuGaiDeQueXian.f();
        fuGaiDeQueXian.g();
        Derived derived = new Derived();
        derived.g();
    }
}
class Derived extends FuGaiDeQueXian {
    public void f(){System.out.println("public f()!");}
    public void g(){};
}