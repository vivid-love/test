package PTA;

import java.util.Scanner;

public class Main27 {
    public void show(){
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b[] = new int[a];
        for(int i=0;i<a;i++){
            b[i] = scanner.nextInt();
        }
        for(int i = 0;i<3;i++){
            int min = b[i];
            int flag = 0;
            for(int j=i;j<a-1;j++){
                min = Math.min(min,b[j+1]);
            }
            for(int k = i;k<a;k++){
                if(min==b[k]){
                    flag=k;
                }
            }
            int tem = b[i];
            b[i] = b[flag];
            b[flag] = tem;
        }
        for(int i=0;i<a;i++){
            System.out.print(String.format("%5d",b[i]));
        }
    }

    public static void main(String[] args) {
        Main27 main27 = new Main27();
        main27.show();
    }
}
