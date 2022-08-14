package PTA;

import java.util.Scanner;

public class Main50 {
    public void show(){
        Scanner scanner = new Scanner(System.in);
        int a[][] = new int[4][5];
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                for(int k = 0;k<4;k++){
                    if(a[i][k]>a[i][k+1]){
                        int temp = a[i][k];
                        a[i][k] = a[i][k+1];
                        a[i][k+1] = temp;
                    }
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(String.format("%4d",a[i][j]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main50 main50 = new Main50();
        main50.show();
    }
}
