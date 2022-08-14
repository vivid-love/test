package innerclassuse;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class ActionPerform implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {//到达指定的时间间隔后，定时器就会调用这个方法.
        Date date = new Date();
        System.out.println("此时是 "+date);
        Toolkit.getDefaultToolkit().beep();//这是什么方法
    }
}

public class CallBack {


    public static void main(String[] args) {
        ActionListener ap=new ActionPerform();
        new Timer(1000,ap).start();//ap 定时器每隔一段时间进行这个方法调调用然后就是这行 ap这个ActionEvent

        JOptionPane.showMessageDialog(null,"??");
        System.exit(0);
    }
}




