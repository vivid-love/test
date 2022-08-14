package PTA;

import java.util.Scanner;

public class    PTA35 {
    public void show(String string1, String string2){
        System.out.println(string1+string2);
    }
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        String string1 =  scanner1.nextLine();
        String string2 = scanner1.nextLine();
        PTA35 pta35  = new PTA35();
        pta35.show(string1,string2);
    }
}
