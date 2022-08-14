package PTA;

import java.util.Scanner;

public class Main53 {
    public void show(){
        Scanner scanner = new Scanner(System.in);
        int scale =16;
        int BCD = scanner.nextInt();
        char HEX[] = new char[String.valueOf(BCD).length()];
        int flag = 0;
        for(int i=0;i<HEX.length;i++){
            int carry = BCD%scale;
            int integer = BCD/scale;
            if(carry>9){
                HEX[i] = chance(carry);
            }
            else {
                char[] a = String.valueOf(carry).toCharArray();
                HEX[i] = a[0];
            }
            flag++;
            if(integer<scale){
                if(integer>9){
                    HEX[i+1] = chance(integer);
                }
                else {
                    char[] b = String.valueOf(integer).toCharArray();
                    HEX[i+1] = b[0];
                }

                flag++;
                break;
            }
        }
        for(int i=flag-1;i>=0;i--){
            System.out.print(HEX[i]);
        }

    }
    public char chance(int a){
        char HEX = 'A';
        switch (a){
            case 10:
                    HEX='A';
                    break;
            case 11:
                HEX = 'B';
                break;
            case 12:
                HEX = 'C';
                break;
            case 13:
                HEX = 'D';
                break;
            case 14:
                HEX = 'E';
                break;
            case 15:
                HEX = 'F';
                break;
        }
        return HEX;
    }

    public static void main(String[] args) {
        Main53 main53 = new Main53();
        main53.show();
    }
}
