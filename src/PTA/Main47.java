package PTA;

import java.util.Scanner;

public class Main47 {
    public void show(){
        int right[] = new int[1000];
        int rightflag = 0;
        for(int i =1;i<1000;i++){
            char  a1[] = down(String.valueOf(i).toCharArray());
            char  aa1[] = down(String.valueOf(((int)Math.pow(i,2))).toCharArray());
            int flag = 0;
            for(int j=0;j<a1.length;j++){

                if(a1[j]==aa1[j]){
                    flag++;
                }
            }
            if(flag==a1.length){
                right[rightflag++] = i;
            }
        }
        for(int i=0;i<1000;i++){
            if(right[i]!=0){
                System.out.print(String.format("%6d",right[i]));
            }
        }
    }
    public char[] down(char A[]) {
        char B[] = new char[A.length];
        int flag = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            B[flag++] = A[i];
        }
        return B;
    }
    public static void main(String[] args) {
        Main47 main47 = new Main47();
        main47.show();
    }
}
