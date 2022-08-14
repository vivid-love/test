package finaltest;
class  AA{
    final public void show(){
        System.out.println("this is finaltest show");
    }
    final private void show1(){
        System.out.println("this is finaltest show1");
    }
    private void show2(){
        System.out.println("this is finaltest show2");

    }
    public void show3(){
        System.out.println("this is finaltest show3");

    }
    public static void show4(){
        System.out.println("this is finaltest show4");

    }
}

public class FinalTest extends AA {
    public void show(int a){
        System.out.println("this is FinalTest show");
    }
    public void show1(){
        System.out.println("this is FinalTest  show1");
        show2();
    }
    private void show2(){
        System.out.println("this is FinalTest  show2");

    }
    public void show3(){
        System.out.println("this is FinalTest  show3");
        super.show3();

    }
    public static void show4(){
        System.out.println("this is FinalTest  show4");
    }
    public static void main(String[] args){
        FinalTest finalTest = new FinalTest();
        finalTest.show(1);//本身
        finalTest.show();//父类
        finalTest.show1();//本身
        finalTest.show4();

    }
}
