package PTA;
/*
*泰勒公式每一项都是总值的一部分，只是越到后面对应项的值占比就越小。要精确到某一个小数点后面就是对应项精确的小数位到久可以了（或者说是比它小就可以了）
*
 */
import java.util.Scanner;

public class Main45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a =myin(scanner.nextDouble());
        System.out.println(String.format("%.3f",a));
    }
    static double myin(double num2) {
        int i = 1, negation = 1;//取反 negation，实现1，-1交替
        double sum; //累加项
        double index = num2;
        double Factorial = 1;//阶乘初始值
        double TaylorExpansion = num2;//泰勒展开式初始值

        do {
            Factorial = Factorial * (i + 1) * (i + 2); //求阶乘
            index *= num2 * num2; //求幂函数
            negation = -negation;
            sum = index / Factorial * negation; //最新一次得到的累加项
            TaylorExpansion += sum;
            i += 2;
        } while (myabs(sum) > 1e-5); //累加项比条件大，继续，否则退出循环
        return TaylorExpansion;
    }

    static double myabs(double num1) {
        return num1 > 0 ? num1 : -num1;
    }
}

