package test1;
//import test2.SameNameTest;

public class SameNameTest extends test2.SameNameTest {
    public void AA(){
        System.out.println("SameNameTest!");
    }
    public static void main(String[] args){
        test1.SameNameTest sameNameTest = new test1.SameNameTest();
        sameNameTest.AA();
        sameNameTest.CC();
//        sameNameTest
        test2.SameNameTest sameNameTest2 = new test2.SameNameTest();
        sameNameTest2.AA();

    }
}
