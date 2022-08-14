package innerclassuse;
interface Contents{
    void value(int a);
}

public class Class3 {
    private int a;
    public Contents contents( ){
     return new Contents(){
         private int i =11;
         public void value(int a2){System.out.println(i);System.out.println("参数");System.out.println("参数a2   "+a2);}
        };
    }
    public static void main(String[] args){
        Contents contents = new Contents(){
            @Override
            public void value(int a){
                System.out.println("ssssssssssssssssssssssssss");
            }
        };
        contents.value(11);
        Class3 class3 = new Class3();
        Contents  contents1 = class3.contents();
        contents1.value(12);
    }
}
