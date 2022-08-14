package PTA;

import java.util.Scanner;

public class Main36 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入大写字符");
        String str = scanner.nextLine();
        //定义三个变量，定义大写字母，小写字母，数字 字符出现的次数
        int bigCount=0;//大写
        int smallCount=0;//小写
        int number=0;//数字
        int Space=0;//空格
        //遍历字符串
        for (int i=0;i<str.length();i++){
            //取出遍历的字符
            char ch = str.charAt(i);
            //判断该字符是 大写字母，小写字母，数字，字符
            if (ch>=65&&ch<=90){
                bigCount++;
            }
            if (ch>=97&&ch<=122){
                smallCount++;
            }
            if (ch>=48&&ch<=57){
                number++;
            }
            if (ch==32){
                Space++;
            }
        }
        System.out.println("小写字母="+smallCount);
        System.out.println("大写字母="+bigCount);
        System.out.println("数字="+number);
        System.out.println("空格="+Space);
    }
}


