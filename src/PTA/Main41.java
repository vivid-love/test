package PTA;

import java.util.ArrayList;

public class Main41 {
    public static void show(){
        int grade = 0;
        int number =1;
        ArrayList arrayList = new ArrayList();
        do{
            grade = fib(number++);
            arrayList.add(grade);
        } while (grade<10000);
        for(int i=arrayList.size()-1;i>0;i--){
            if((int)arrayList.get(i)<10000){
                System.out.println(arrayList.get(i));
                break;
            }

        }
    }
    public static int fib(int i){
        if(i==1||i==2){
            return 1;
        }
        else {
            return fib(i-1)+fib(i-2);
        }
    }
    public static void main(String[] args) {
        Main41.show();
    }
}
