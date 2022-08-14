package PTA;

import java.util.Scanner;

public class Main17_1 {
    public void show(){
        Scanner  scanner = new Scanner(System.in);
        int inputA[] = new int[3];
        for(int i=0;i<3;i++){
            inputA[i] = scanner.nextInt();
        }
        char re[] = String.valueOf(inputA[2]).toCharArray();
        int max2 = getscale(inputA);
        int fitResult[] = new int[40];
        int flag = 0;
        for(int i=max2+1;i<=40;i++){
            int number1 = change(i,inputA[0]);
            int number2 = change(i,inputA[1]);
            int number3 = change(i,inputA[2]);
            if(number1*number2==number3){
                fitResult[flag++] = i;
            }
        }
        int min = fitResult[0];
        for(int i=0;i<fitResult.length;i++){
            if(min>fitResult[i]&fitResult[i]!=0){
                min=fitResult[i];
            }
        }
        System.out.println(min);
    }
    public int getscale(int input[]){
        int max = 0;
            for(int i=0;i<3;i++){
                char a[] = String.valueOf(input[i]).toCharArray();
                for(int j=0;j<a.length;j++){
                    max = Math.max(max,Integer.parseInt(String.valueOf(a[j])));
                }
            }

        if(max==0){
            max=1;
        }
        return max;
    }
    public int change(int scale,int number){
        char numberChar[] = String.valueOf(number).toCharArray();
        int result = 0;
        String resultChar[] = new String[numberChar.length];
        int flag = 0;
        for(int i=numberChar.length-1;i>=0;i--){
            result = Integer.parseInt(String.valueOf(numberChar[i]))*(int)Math.pow(scale,flag);
            resultChar[flag++] = String.valueOf(result);

        }
        int resultReturn = 0;
        for(int i=0;i<resultChar.length;i++){
            resultReturn = resultReturn+Integer.parseInt(resultChar[i]);
        }
        return resultReturn;
    }
    public static void main(String[] args) {

        Main17_1 main17_1 = new Main17_1();
        main17_1.show();
    }
}
