package PTA;

import java.util.Scanner;

public class Main29 {
    public void show(int a[]){
        int min = a[0];
        int weizhi = 0;
        for(int i = 0;i<a.length;i++){
            if(min>a[i]){
                min = a[i];
                weizhi = i;
            }
        }
        int tem = a[0];
        a[0] = a[weizhi];
        a[weizhi] = tem;
        for(int j=0;j< a.length;j++){
            System.out.printf("%4d",a[j]);
        }
        System.out.println();
        System.out.print("min="+min+","+"weizhi="+weizhi);


    }

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        a[0] = scanner.nextInt();
        a[1] = scanner.nextInt();
        a[2] = scanner.nextInt();
        a[3] = scanner.nextInt();
        a[4] = scanner.nextInt();
        Main29 main29 = new Main29();
        main29.show(a);
    }
}
