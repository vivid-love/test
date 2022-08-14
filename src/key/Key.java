package key;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;


/**
 *
 */

/**
 * @author Administrator
 *
 */
//窗体类
public class Key extends JFrame {

    /**
     * @param args
     */
    char charA;
    public Key(){
        this.setSize(500,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("my jframe");
        this.setVisible(true);
        this.addKeyListener(new MyKeyListener());


    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Key();
        new MyKeyListener();
    }

}
//监听键盘类
class MyKeyListener extends KeyAdapter{
    public void keyPressed(KeyEvent e){
        char charA=e.getKeyChar();
        System.out.println("你按了《"+charA+"》键");
    }
}

