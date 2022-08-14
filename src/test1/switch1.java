package test1;

public class switch1 {
    public void set(int a){
        switch (a){
            case 1:
               System.out.println(a);
                break;
            case 2:
                System.out.println(a);
                break;
            case 3:
                System.out.println(a);
                break;
            case 4:
                System.out.println(a);
                break;
            default:
                break;
        }
    }
    public static void main(String[] args){
        switch1 switch1 = new switch1();
        switch1.set(2);
    }
}
