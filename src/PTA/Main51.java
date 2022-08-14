package PTA;

import java.util.Scanner;

public class Main51 {
    public void show(){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char a1[] = a.toCharArray();
        char downa[] = new char[a.length()];
        int number = 0;
        for(int i=a.length()-1;i>=0;i--){
            downa[number++] = a1[i];
        }
        String downaStirng = String.valueOf(downa);
        String allString = downaStirng+a;
        System.out.println(allString);
    }

    public static void main(String[] args) {
        Main51 main51 = new Main51();
        main51.show();
    }
}
