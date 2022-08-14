package exception;
class A extends Exception{
    A(String nameA){
        super(nameA);
    }
};
//class B extends A{};
//class C extends B{};


public class Exception1 {
    public Exception1() throws A{
        System.out.println("skadjfkasl;jf");
        throw  new A("aaaaaaaaaaaa");

    };
//    public void event()throws B,C{ System.out.println("skadjfkasl;jf");};
    public static void main(String[] args){
        try{
            Exception1 exception1 = new Exception1();
//            exception1.event();
        } catch (A a) {
            a.printStackTrace(System.out);
            System.out.println("skadjfkasl;jf");
        }
    }
}
