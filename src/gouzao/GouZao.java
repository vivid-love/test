package gouzao;
class A1{
    static int a1b = 11;
    int a1a = 10;
    int a1c ;
    A1(int a1x){
        System.out.println("A1");
        a1c = 12;
        /* showA1_2();这种逻辑错误很难被发现除非对java基础很了解*/
        showA1(a1x);//的使用防止构造器内部的多态行为
        showA1_2();//构造器内部的多态行为因为被子类重载所以执行的的是子类的showA1_2.有因为这个函数的执行在int a 被构造器赋值10之前所以执行的结果是零
        showA1_2(a1b);//因为构造器没有父类的指令所以就执行成员变量赋值之后再执行下来结果就是和我们想要的效果一样输出a1b的值
    }
    final void showA1(int a1x){
        System.out.println("this is A1   :"+a1x);
    }
     void showA1_2(){
        System.out.println("this is A1 showA1_2");
    }
    void showA1_2(int a1b){
        System.out.println("this is A1 showA1_2====>"+a1b);
    }
}
class A2{
    A2(){
        System.out.println("A2");
    }
}
class A3{
    A3(){
        System.out.println("A3");
    }
}
class A4{
    A4(){
        System.out.println("A4");
    }
}
class A5 extends A1{
    A5(int a1x){
        super(a1x);
        System.out.println("A5");
    }
}

class A6 extends A5{
    static A2 a2 = new A2();
    int a = 10;
    String string6 = "dlafsj;kfdja;lkf";
    A3 a3;
    A4 a4 = new A4();
    int aa ;
    A6(int a1x){
        super(a1x);

        System.out.println("A6");
        System.out.println(a);

        a3 = new A3();
        aa = 11;
    }

    void showA1_2(){
        System.out.println("this is A6"+a);
    }
}
public class GouZao extends A6 {
    GouZao(int a1x){
        super(a1x);
    }
    public static void main(String[] args){
        new GouZao(8);
    }
}
