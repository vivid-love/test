package PTA;
//1.如果同时使用两个Scanner对象的话会报错
//2是使用一个Scanner对象的话，如果前面的是是nextInt，后面使用nextLine会发现少读了一行，是因为换行符的问题，建议是前面也使用nextLine然后在转为自己想要的数据类型这样统一就不会出现后面少一行的问题了。

//第一行为空，问题在于ss[i]=sc.nextLine();这一行代码，因为int num = sc.nextInt()仅仅是把第一行的整数值读取了，在管道缓存中，还有换行符（enter），当在下面的nextLine（）首先是读取第一行的换行符前面的数据，就是null，所以读取的数据就会少一行

import java.util.Scanner;

public class Main80 {
    public void show(int a,Scanner scanner){

//        Scanner scanner1 = new Scanner(System.in);

        int aNumber[] = new int[a];
        for(int i = 0;i<a+1;i++){
            if(i==0){
                continue;
            }
            String aString = scanner.nextLine();
            aNumber[i-1] = aString.length();
        }
        for(int i=0;i<a;i++){
            System.out.println(aNumber[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Main80 main80 = new Main80();
        main80.show(a,scanner);
    }
}
