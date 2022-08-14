package Frame1;

import newframe.frame;

import javax.swing.*;
import java.awt.*;

public class JFrame1 extends JFrame{
    JFrame1(){



    }
    public static void main(String[] args){
        JFrame jFrame = new JFrame("获取标题栏大小");
        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jFrame.setVisible(true);
        ImageIcon icon = new ImageIcon("C:\\parameter\\ImageGame\\1.jpg");
        JLabel jLabel = new JLabel(icon);
        JDialog jDialog  = new JDialog(jFrame);
        jDialog.setBounds(400,133+30,200,200);

        jDialog.setUndecorated(true);
//        jDialog.setOpacity(0.9f);
//        jDialog.setBackground(new Color(0,0,0,255));
        jDialog.add(jLabel);
        jDialog.setVisible(true);
//        jFrame.add(jDialog);
        Insets insets = jFrame.getInsets();
        System.out.println(insets);
        System.out.println(insets.bottom);

    }
}
