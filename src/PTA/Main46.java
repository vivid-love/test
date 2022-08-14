package PTA;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main46 {
    public static void show(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b[] = new int[10];
        int number = 0;
        if(a<200||a>20000){
            System.exit(1);
        }
        for(int i=a-1;i>0;i--){
            int flag =0;
            for(int j =1;j<i;j++){
                if(i%j==0){
                    flag++;
                }
            }
            if(flag<=2){
                b[number++] = i;

            }
            if(b[9]!=0){
                break;
            }

        }
        for(int i=0;i<10;i++){
            System.out.print(String.format("%6d",b[i]));
        }
    }
    public static void main(String[] args) {
        Main46.show();
    }
}
