package test1;

public class ClassFlow {
    int a;
    String bstring;
    static {System.out.println("this is ClassFlow 静态代码块！");}
   public ClassFlow(int a,String bstring){
        this.a = a;
        this.bstring = bstring;

        System.out.println("this is ClassFlow  "+this.a+this.bstring);
    }

    public void show1(int a){
       System.out.println("this is show1 int :" +a);
    }
    public static void show2(int c){
        System.out.println("this is show int "+c);
    }
    public static void main(String[] args){
       ClassFlow classFlow = new ClassFlow(3,"sss");
       classFlow.show1(1);
       ClassFlow.show2(2);
    }
}
