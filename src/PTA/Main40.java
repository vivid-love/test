package PTA;

import java.util.Scanner;

public class Main40 {
    public void show(int a){
        int aNumber = a+1;
        while (true){
            int number = 0;
            for(int i = 1;i<=aNumber;i++){
                if(aNumber%i==0){
                    number++;
                }
                if(number>2){
                    break;
                }
            }
            if(number==2){
                System.out.println(aNumber);
                break;
            }
            aNumber++;

        }

    }
    public static void main(String[] args){
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        Main40 main40 = new Main40();
        main40.show(a);
    }
}
