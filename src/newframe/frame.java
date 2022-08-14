package newframe;

import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {
    frame(){
        ImageIcon icon = new ImageIcon("D:\\Document\\course\\1.jpg");
        JLabel jLabel = new JLabel(icon);
        jLabel.setBounds(0,0,888,888);
        JDialog showjDialog = new JDialog(this);
        showjDialog.setUndecorated(true);
        showjDialog.setOpacity(0.9f);
        showjDialog.setBackground(new Color(0,0,0,0));
        showjDialog.setBounds(0, 0, 1080, 1920-180);
        showjDialog.setVisible(true);
        showjDialog.add(jLabel);
        System.out.println("dskjaflkdfjas;dfjaskdf");
    }
    public static void main(String[] args){
        frame frame1 = new frame();
        frame1.setVisible(true);
    }
}
