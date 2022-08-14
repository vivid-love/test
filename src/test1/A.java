package test1;
class B{
    public  void show(){
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
    }
}

public class A extends B {
    public  void show(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

    }
//    public  void show(){
//        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
//
//    }
    public static void main(String[] args){
        A a = new A();
        a.show();
        B b = a;
        b.show();

    }
}
