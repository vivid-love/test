package innerclassuse;
class WithInner{
    class Inner{
        Inner(int a){
            System.out.println("this is Inner int a   : "+a);
        }

    }
        }


public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner win){
        win.super(11);
        System.out.println("this is InheritInner class");
    }
    public static void main(String[] args){
        WithInner withInner = new WithInner();
        InheritInner inheritInner = new InheritInner(withInner);
    }
}
