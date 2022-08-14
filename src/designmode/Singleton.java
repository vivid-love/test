package designmode;
class Soup2{
    public int a=10;
    public int b =30;
    private  Soup2(){
        System.out.println("Soup2单一的设计模式构造函数");
    };
    private static Soup2 soup2 = new Soup2();
    public static  Soup2 access(){
        return soup2;
    }

}
public class Singleton {
    public static void main(String[] args){
        Soup2 s2 = Soup2.access();
        System.out.println("第一次s2:"+s2.a+"   "+s2.b);
        Soup2 s3 = Soup2.access();
        s3.a = 1;
        s3.b = 3;
        System.out.println("第一次s3:"+s3.a+"   "+s3.b);
        System.out.println("第二次s2:"+s2.a+"   "+s2.b);

    }
}
