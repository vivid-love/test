package PTA;

import java.util.Scanner;

public class Main65 {
    public void getinformation(){
        Scanner scanner = new Scanner(System.in);
        int a2char[] = new int[2];
        for(int i=0;i<2;i++){
            a2char[i] = scanner.nextInt();
        }

        getGrade(scanner,Integer.parseInt(String.valueOf(a2char[0])),Integer.parseInt(String.valueOf(a2char[1])));

    }
    public void getGrade(Scanner scanner,int one, int two){
        int aOne[] = new int[one];
        int aTwo[] = new int[two];
        int oneNumber = 0;
        int twoNumber = 0;
        for(int i = 0;i<one;i++){
            aOne[i]  = scanner.nextInt();
            oneNumber = oneNumber+aOne[i];
        }
        for(int i = 0;i<two;i++){
            aTwo[i] = scanner.nextInt();
            twoNumber = aTwo[i]+twoNumber;
        }
        System.out.println(oneNumber+" "+twoNumber);
    }
    public static void main(String[] args) {
        Main65 main65 = new Main65();
        main65.getinformation();
    }
}
