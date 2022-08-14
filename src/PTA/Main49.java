package PTA;

import java.util.Scanner;

public class Main49 {
    public void show(){
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
        int flag =0;
        for(int i=0;i<10;i++){
            int aa = scanner.nextInt();
            boolean markerJ = judge(aa);
            if(markerJ==true){
                a[flag++] = aa;
            }
        }
        for(int j=0;j<flag;j++){
            for(int i=0;i<flag-1;i++){
                if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                }
             }
        }
        for(int i=0;i<flag;i++){
            System.out.print(String.format("%4d",a[i]));
        }

    }
    public boolean judge(int B){

        boolean marker =true;
        for(int i=2;i<=Math.sqrt(B);i++){
            if(B%i==0){
                marker=false;
            }

        }
        if(B==1){
            marker=false;
        }
        return marker;
    }
    public static void main(String[] args) {
        Main49 main49 = new Main49();
        main49.show();
    }
}
