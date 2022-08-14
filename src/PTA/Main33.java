package PTA;

public class Main33 {
    public void show(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==j){
                    a[i][j]=a[i][j]*a[i][j];
                    continue;
                }
                if(j>i){
                    a[i][j] = a[i][j]+3;
                    continue;
                }
                if(j<i){
                    a[i][j]=a[i][j]*2;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++) {
                System.out.print(String.format("%3d",a[i][j]));
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Main33 main33 = new Main33();
        main33.show(a);
    }
}
