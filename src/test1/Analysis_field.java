package test1;
//    注释掉： public static int A=2;后同时解析相同的字段会解析失败报错。引用不明确
public class Analysis_field {
    interface Interface0{
       static int A=0;
//       int b;
       void show1();
    }
    interface Interface1 extends Interface0 {
      static   int A = 1;
    }
    static class Sub implements  Interface1 ,Interface0{
        public static int A=2;
        public void show1(){};
    }
    public static void main(String[] args){
        System.out.println(Sub.A);
    }


}
