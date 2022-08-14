package test1;

//import org.omg.CORBA.ObjectHolder;

public class Test3 {
    static class Test{
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instanceObj = new ObjectHolder();
        void foo(){
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");
        }
    }
    private static class ObjectHolder{};

    public  static void main(String[] args){
        Test test = new Test3.Test();
        test.foo();
    }
}
