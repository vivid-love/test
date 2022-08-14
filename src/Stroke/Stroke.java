package Stroke;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Stroke {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable(){

            public void run (){

                JFrame frame = new JFrame();

                frame.setTitle("2D图形");

                frame.add(new DrawComponent());//添加自己的JComponent

                frame.setSize(400,400);//设置窗口大小
               Point a =  frame.getLocation();
                System.out.println(a);

                System.out.println(a.x);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                System.out.println("sssssssssssssssss:  "+(int)(1024*0.12));
                {
                    int b=0;
                    System.out.println(b);
                }



                frame.setVisible(true);

            }

        });

    }

}

class DrawComponent extends JComponent{

    public void paintComponent(Graphics g){

        final int DEFAULT_WIDTH = 400;

        final int DEFAULT_HEIGHT = 400;

        Graphics2D g2 = (Graphics2D)g;

        double leftx = 100;

        double topy =100;

        double width =200;

        double height = 150;

////画矩形
//
//        Rectangle2D rect = new Rectangle2D.Double(leftx,topy,width,height);
//
//        g2.draw(rect);
//
////画椭圆
//
//        Ellipse2D ellip = new Ellipse2D.Double();
//
//        ellip.setFrame(rect);
//
//        g2.draw(ellip);

//画一条直线
        g2.setStroke(new BasicStroke(1.0f));
//        g2.draw(new Line2D.Double(leftx,topy,leftx+width,topy+height));
        g2.draw(new Line2D.Double(10,100,200,100));

//画另一个椭圆

//        double centerx = rect.getCenterX();
//
//        double centery = rect.getCenterY();
//
//        double radius = 150 ;
//
//        Ellipse2D circle = new Ellipse2D.Double();
//
//        circle.setFrameFromCenter(centerx,centery,centerx+width,centery+height);
//
//        g2.draw(circle);

    }

}

