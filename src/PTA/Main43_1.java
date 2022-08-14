package PTA;

public class Main43_1 {
    public static double calcPi(int n) {
        double Pi=0;
        for(int i = 0;i<n;i++) {
            if(i%2==1) {
                Pi=Pi-((double)1/(2*i+1));
            }
            else {
                Pi=Pi+((double)1/(2*i+1));
            }
        }
        return  Pi*4;
    }
    public static void main(String[] args) {
        double Pi=calcPi(6000);
        System.out.println(String.format("%.6f",Pi));
    }
}