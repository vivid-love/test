package PTA;


public class Main39 {
    public void show(){
        int number = 0;
        for(int i=1;i<=100;i++){
            int a = i/100;
            int b = (i%100)/10;
            int c = ((i%100)%10);
//            System.out.println(a+" "+b+" "+c);
            if(a+b+c==5){
                number++;
            }
        }
        System.out.println(number);
    }
    public static void main(String[] args){
        Main39 main39 = new Main39();
        main39.show();
    }
}
