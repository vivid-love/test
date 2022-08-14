package innerclassuse;

abstract class Base{

    public Base(int i){
        System.out.println("this is Base int "+i);

    }

    public abstract void show();
}

public class Class4 {
    public Base base(int a,int b){
        return new Base( a) {
            public   int b1 =b;
            {System.out.println("this is Base int  "+a);}//只是一条语句而已
            @Override
            public void show() {
                System.out.println("this is Base.show "+a);
                System.out.println("this is Base.show a1  "+b1);
            }
        };
    }
    public static void main(String[] args){
        Class4 class4 = new Class4();
        Base base = class4.base(51,50);//调用的构造函数是Base（这个类可以被其他类当做接口类使用，会调用我们自己给Base定义的构造函数）
        base.show();
    }
}
