package PTA;

import sun.applet.Main;

import java.util.Scanner;

public class Main28 {
    public void show(int a[],int input){
        int newa[] = new int [a.length+1];
        int number = 0;
        for(int i = 0;i<a.length;i++){
            if(input<a[0]){
                number = 0;
//                System.out.println(a[i]+"  "+a[i+1]+"    i:"+number);
                break;
            }
            if(input>a[a.length-1]){
                number = a.length-1;
//                System.out.println(a[i]+"  "+a[i+1]+"    i:"+number);
                break;
            }
            if(a[i]<input&&a[i+1]>input){
                number = i;
//                System.out.println(a[i]+"  "+a[i+1]+"    i:"+i);
                break;
            }


        }
        for(int j=0;j<newa.length;j++){
            if(number==j){
                newa[j] = input;
            }
            else if (j == number+1){
                newa[j] = input;
                continue;
            }
            if(j<=number){
                newa[j] = a[j];
                continue;
            }
            if(j>number+1){
                newa[j] = a[j-1];
                continue;
            }
        }
        if(number==0){
            int tem = newa[0];
            newa[0]= newa[1];
            newa[1] = tem;
        }
        for(int k = 0;k<newa.length;k++){
            System.out.printf("%5d",newa[k]);
        }


    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 6, 8, 9, 12, 15, 149, 156 };
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Main28 main28 = new Main28();
        main28.show(a, input);
    }
}
