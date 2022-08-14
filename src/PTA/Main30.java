package PTA;

import java.util.Random;

public class Main30 {
    public void show(){
        for(int i =1;i<=7;i++){
            for(int j = 1;j<=7;j++){
                if(i==j){
                    System.out.print(String.format("%2d",1 ));
                    continue;
                }
                if(i+j==8){
                    System.out.print(String.format("%2d",1 ));
                    continue;
                }
                //上半部分
                if(i<4){
                    if(j>i&&j<8-i){
                        System.out.print(String.format("%2d",2 ));
                        continue;
                    }
                    if(j<i){
                        System.out.print(String.format("%2d",3 ));
                        continue;
                    }

                    if(j>8-i){
                        System.out.print(String.format("%2d",4 ));
                        continue;
                    }
                }
                if(i==4){
                    if(j>i&&j<8-i){
                        System.out.print(String.format("%2d",2 ));
                        continue;
                    }
                    if(j<i){
                        System.out.print(String.format("%2d",3 ));
                        continue;
                    }

                    if(j>8-i){
                        System.out.print(String.format("%2d",4 ));
                        continue;
                    }
                }
                if(i>4){
                   if(j<8-i){
                       System.out.print(String.format("%2d",3 ));
                       continue;
                   }
                   if(j>8-i&&j<i){
                       System.out.print(String.format("%2d",5 ));
                       continue;
                   }
                   if(j>i){
                       System.out.print(String.format("%2d",4 ));
                       continue;
                   }
                }

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Main30 main30 = new Main30();
        main30.show();
    }
}
