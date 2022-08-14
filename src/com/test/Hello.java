package com.test;
import java.util.ArrayList;
public class Hello {
    public ArrayList anyValues(int x1,int y1) {
        ArrayList allAllxyArrayList = new ArrayList();
        ArrayList allxyArrayList = new ArrayList();
        int ax = x1;
        int ay = y1;
        for(int k=0;k<12;k++) {
            ArrayList xyArrayList = new ArrayList();
            ArrayList xArrayList = new ArrayList();
            ArrayList yArrayList = new ArrayList();


            for(int i=1;i<=20;i++) {
                if(k==0) {
                    if(i==0) {
                        xArrayList.add(ax*i);
                        yArrayList.add(ay*i);
                    }
                    else {
                        xArrayList.add(ax+15*(i-1));
                        yArrayList.add(ay*1);
                    }
                }
                if(k==1) {
                    if(i==0) {
                        xArrayList.add(ax*i);
                        yArrayList.add(ay*i);
                    }
                    else {
                        double radians = Math.toRadians(30);
                        int x = ax+(i-1)*15;
                        int y = (int)(ay-(((i-1)*15)*Math.tan(radians)));
                        xArrayList.add(x);
                        yArrayList.add(y);
                    }
                }
                if(k==2) {
                    if(i==0) {
                        xArrayList.add(ax*i);
                        yArrayList.add(ay*i);
                    }
                    else {
                        double radians = Math.toRadians(60);
                        int x = ax+(i-1)*15;
                        int y = (int)(ay-(((i-1)*15)*Math.tan(radians)));
                        xArrayList.add(x);
                        yArrayList.add(y);
                    }
                }
                if(k==3){
                    if(i==0) {
                        xArrayList.add(ax*i);
                        yArrayList.add(ay*i);
                    }
                    else {
                        xArrayList.add(ax);
                        yArrayList.add(ay-15*(i-1));
                    }
                }
                if(k==4) {
                    if(i==0) {
                        xArrayList.add(ax*i);
                        yArrayList.add(ay*i);
                    }
                    else {
                        double radians = Math.toRadians(120);
                        int x = ax-(i-1)*15;
                        int y = (int)(ay+(((i-1)*15)*Math.tan(radians)));
                        xArrayList.add(x);
                        yArrayList.add(y);
                    }
                }
                if(k==5) {
                    if(i==0) {
                        xArrayList.add(ax*i);
                        yArrayList.add(ay*i);
                    }
                    else {
                        double radians = Math.toRadians(150);
                        int x = ax-(i-1)*15;
                        int y = (int)(ay+(((i-1)*15)*Math.tan(radians)));
                        xArrayList.add(x);
                        yArrayList.add(y);
                    }
                }
                if(k==6) {
                    if(i==0) {
                        xArrayList.add(ax*(i-1));
                        yArrayList.add(ay*i);
                    }
                    else {
                        xArrayList.add(ax-15*i);
                        yArrayList.add(ay);
                    }
                }
                if(k==7) {
                    if(i==0) {
                        xArrayList.add(ax*i);
                        yArrayList.add(ay*i);
                    }
                    else {
                        double radians = Math.toRadians(210);
                        int x = ax-(i-1)*15;
                        int y = (int)(ay+(((i-1)*15)*Math.tan(radians)));
                        xArrayList.add(x);
                        yArrayList.add(y);
                    }
                }
                if(k==8) {
                    if(i==0) {
                        xArrayList.add(ax*i);
                        yArrayList.add(ay*i);
                    }
                    else {
                        double radians = Math.toRadians(240);
                        int x = ax-(i-1)*15;
                        int y = (int)(ay+(((i-1)*15)*Math.tan(radians)));
                        xArrayList.add(x);
                        yArrayList.add(y);
                    }
                }
                if(k==9) {
                    if(i==0) {
                        xArrayList.add(ax*i);
                        yArrayList.add(ay);
                    }
                    else {
                        xArrayList.add(ax);
                        yArrayList.add(ay+15*(i-1));
                    }
                }
                if(k==10) {
                    if(i==0) {
                        xArrayList.add(ax*i);
                        yArrayList.add(ay*i);
                    }
                    else {
                        double radians = Math.toRadians(300);
                        int x = ax+(i-1)*15;
//						System.out.println((i-1)*15);
//						System.out.println((i-1)*15*Math.tan(radians));
                        int y = (int)(ay-(((i-1)*15)*Math.tan(radians)));
                        xArrayList.add(x);
                        yArrayList.add(y);
                    }
                }
                if(k==11) {
                    if(i==0) {
                        xArrayList.add(ax*i);
                        yArrayList.add(ay*i);
                    }
                    else {
                        double radians = Math.toRadians(330);
                        int x = ax+(i-1)*15;
                        int y = (int)(-((i-1)*15)*Math.tan(radians)+ay);
                        xArrayList.add(x);
                        yArrayList.add(y);
                    }
                }
                xyArrayList.add(xArrayList);
                xyArrayList.add(yArrayList);
            }
            allxyArrayList.add(xyArrayList);
        }
        return allxyArrayList;
    }
    //函数得到的数据是正确的只是下边打印写错了所以数据是重复的。
    public static void main(String[] args) {
        Hello array_funtion = new Hello();
        array_funtion.anyValues(300, 300);
        ArrayList allAllxyArrayList = new ArrayList();
        int ax1 = 300;
        int ay1 = 300;
        ArrayList allxyArrayList = array_funtion.anyValues(ax1, ay1);
        //获取值
        for(int k=0;k<20;k++) {
            ArrayList allxy3ArrayList = new ArrayList();
            for(int i=0;i<allxyArrayList.size();i++) {
                ArrayList allxy2ArrayList = new ArrayList();
                for(int j=k;j<((ArrayList)((ArrayList)allxyArrayList.get(i)).get(0)).size();j++) {
//				        	   if((int)((ArrayList)((ArrayList)allxyArrayList.get(i)).get(0)).get(j)>0&&(int)((ArrayList)((ArrayList)allxyArrayList.get(i)).get(1)).get(j)>0&&(int)((ArrayList)((ArrayList)allxyArrayList.get(i)).get(1)).get(j)<590&&(int)((ArrayList)((ArrayList)allxyArrayList.get(i)).get(0)).get(j)<590) {
                    System.out.println((int)((ArrayList)((ArrayList)allxyArrayList.get(i)).get(0)).get(j)+"      "+(int)((ArrayList)((ArrayList)allxyArrayList.get(i)).get(1)).get(j)+"     "+i);
                    allxy2ArrayList.add((int)((ArrayList)((ArrayList)allxyArrayList.get(i)).get(0)).get(j));
                    allxy2ArrayList.add((int)((ArrayList)((ArrayList)allxyArrayList.get(i)).get(1)).get(j));
                    break;
                }
                System.out.println("end!!!!!!!!!!!!!!!!"+i);
                allxy3ArrayList.add(allxy2ArrayList);
            }
            allAllxyArrayList.add(allxy3ArrayList);
        }
        System.out.println("--------------------------------------------------------------------------");
        for(int k=0;k<allAllxyArrayList.size();k++) {
            for(int j=0;j<((ArrayList)allAllxyArrayList.get(k)).size();j++) {
                int x =(int)((ArrayList)((ArrayList)allAllxyArrayList.get(k)).get(j)).get(0);
                int y =(int)((ArrayList)((ArrayList)allAllxyArrayList.get(k)).get(j)).get(1);
                System.out.println(x+"    "+y+"        "+j);
            }
            System.out.println("==================================="+k);
        }
    }

}
