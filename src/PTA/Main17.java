package PTA;

import java.util.Scanner;

public class Main17 {
    public void show(){
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[3];
        for(int i=0;i<3;i++){
            a[i] = scanner.nextInt();
        }
        String scaleString = String.valueOf(a[2]);
        char scalechar[] = scaleString.toCharArray();
        int max = 0;
        for(int i=0;i<scalechar.length;i++){
            if(max<Integer.parseInt(String.valueOf(scalechar[i]))){
                max=Integer.parseInt(String.valueOf(scalechar[i]));
            }
        }

        if(max==1){
            max = 2;
        }
        int contrast = a[0]*a[1];
        int marker[]  = new int[40];
        int markerflag = 0;
        for(int i=max;i<=40;i++){
            double BCD = 0;
            int flag = 0;
            for(int j = scalechar.length-1;j>=0;j--){
                BCD = BCD+Integer.parseInt(String.valueOf(scalechar[j]))*Math.pow(i,flag);
                flag++;
            }
            if(contrast == (int)BCD){
                marker[markerflag++] = i;
            }
        }
        int min = marker[0];
        for(int i=0;i<40;i++){
            if(min>marker[i]&&marker[i]!=0){
                min = marker[i];
            }
        }
        System.out.println(min);

    }
    public static void main(String[] args) {
        Main17 main17 = new Main17();
        main17.show();
    }
}
