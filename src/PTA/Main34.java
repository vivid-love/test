package PTA;

public class Main34 {
    public void showUp(){
        for(int i=7;i>=1;i=i-2 ){
            for(int j=0;j<(7-i)/2;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            for(int g=0;g<(7-i)/2;g++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public void showDownd(){
        for(int i=1;i<=7;i=i+2 ){
            if(i!=1){
            for(int j=0;j<(7-i)/2;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            for(int g=0;g<(7-i)/2;g++){
                System.out.print(" ");
            }
            System.out.println();
            }
        }
    }
    public static void main(String[] args){
        Main34 main34 = new Main34();
        main34.showUp();
        main34.showDownd();
    }
}
