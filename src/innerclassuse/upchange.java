package innerclassuse;

interface a{
    String readLable();
}

public class upchange {
    class innerclass implements a {
        @Override
        public String readLable() {
            System.out.println("sdflkajdsklfffffffffffffffffffff");
            return null;
        }

    }
    public a w(){
        return new innerclass();

    }
    public static void main(String[] args){
        upchange upchange = new upchange();
        a a1 = upchange.w();
        a1.readLable();
    }
}
