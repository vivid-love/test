package com.test;

import java.util.Arrays;
import java.util.Random;

public class Test_power {
    private  int a=0;
    public void show(){
        System.out.println(a);
    }

    static Object kebian(Object...args){
        for(Object a:args){
            System.out.println(a);
        }
        return args;
    }
    public static void main(String[] args){
        Test_power test_power = new Test_power();
        test_power.show();
        System.out.println(test_power.a);
        int a[] ={1,2,3,4,5,6,7,};
        int a1[];
        a1 = a;
//        for(int i=0;i<100;i++){
//            a1 [i] = i;
//        }
        Random random = new Random(47);
        Random random1 = new Random(47);

        for(int i=0;i<10;i++){
            System.out.println(random.nextInt(20));
            System.out.println(random1.nextInt(20));

        }
        //可变参数
        Object o1 = kebian(1,2,3,4,5,6,7,8,9);
        System.out.println(o1);
        for(int i = 0;i<9;i++){
            System.out.println(o1.getClass());
        }
        System.out.println("");
        ((Object[]) o1).clone();
        String arrays = Arrays.toString(((Object[]) o1).clone());
        System.out.println(Arrays.toString(((Object[]) o1).clone()));
        System.out.println(arrays);
//        for(Object object : o1){
//            System.out.println(object);
//        }
    }
}
