package PTA;

import java.util.Scanner;

public class Main52 {
    public void show(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String aString = String.valueOf(a);
        char chara[] = aString.toCharArray();
        char chara2[] = new char[aString.length()];
        int number = 0;
        for(int i=aString.length()-1;i>=0;i--){
            chara2[number++] = chara[i];
        }
        String downa = String.valueOf(chara2);
        System.out.print(downa);
    }
    public static void main(String[] args) {
        Main52 main52 = new Main52();
        main52.show();
    }
}
