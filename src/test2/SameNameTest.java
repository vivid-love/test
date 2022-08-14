package test2;
import  com.test.Test_power;
class C1{
    C1(){

    }
     protected void testc(){
        System.out.println("testc1 !!");
    }
}
public class SameNameTest{
    private int aa = 10;
    public void AA(){
        System.out.println("SameNameTest!");
    }
    void BB(){
        System.out.println("SameNameTestBB!");
    }
    protected void CC(){
        System.out.println("Protected !!");

    }

    public static void main(String[] args){
        SameNameTest sameNameTest = new SameNameTest();
        System.out.println(sameNameTest.aa);
        C1 c1 = new C1();
        c1.testc();
    }
}
