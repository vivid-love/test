package PTA;

public class Main43 {
    public static void show(){
        int number = 0;
        double allNum = 0;
        double ju = 0;
        do{
        if(number==0){
            allNum = allNum+1;
            ju = allNum;
            number++;
        }
        else {
            double temp = 1.0;
            for(int i=1;i<=number;i++){
                temp = temp*i/(1+2*i);
//                System.out.print("    "+i+"/"+(1+2*i));
            }
            number++;
            ju = temp;
            allNum = allNum+temp;
//            System.out.println(allNum);
        }
        }while (ju>1e-5);
        System.out.println(String.format("%.6f",allNum*2));
    }

    public static void main(String[] args) {
        Main43.show();
    }
}
