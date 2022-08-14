package PTA;

import java.util.Scanner;

public class Main32 {
    public void show(){
        int number1 =0;
        int number2 = 0;
        int a[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        String bstring = scanner.nextLine();
        char c[] = bstring.toCharArray();
        char newc[] = new char[9];
        for(int i=0;i<c.length;i++){
            if(c[i]==' '){
            }
            else {
                newc[number2++] = c[i];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
//                System.out.println(Integer.parseInt(String.valueOf(newc[number1++])));
                a[i][j] = Integer.parseInt(String.valueOf(newc[number1++]));
            }
        }
        transform(a);

    }
    public void transform(int a[][]){
        int tra[][] = new int[3][3];
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                tra[j][i] = a[i][j];
            }
        }
        for(int i =0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(String.format("%4d",tra[i][j]));
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Main32 main32 = new Main32();
        main32.show();
    }
}
