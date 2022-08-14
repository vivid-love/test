package Frame1;

 import java.awt.*;

 import javax.swing.*;

public class JFrame2 extends JFrame {
    private JPanel contentPane;

   public void JFrame2() {

//         this.setSize(500, 500);
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//         this.setLocation(300, 300);
         this.setVisible(true);
//         this.insets();
//         this.set
       contentPane = (JPanel) this.getContentPane();
       setContentPane(contentPane);
       Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();//获取屏幕尺寸对象
       int  screenWidth = (int) screensize.getWidth();//获得屏幕得宽1920
       int  screenHeight = (int) screensize.getHeight();//获得屏幕得高1080
       System.out.println("aaaaaaaaaaaaaaaaaaaaa   :"+screenWidth);
       System.out.println("aaaaaaaaaaaaaaaaaaaaa   :"+screenHeight);
       System.out.println(contentPane.getX());
       System.out.println(contentPane.getSize());

       System.out.println(this.getBounds());
       System.out.println(this.getX());
       System.out.println(this.getInsets());
//       System.out.println(contentPane.getBounds());
    }
//    @Override
//   public void Insets(int top, int left, int bottom, int right){
//
//
//    };

    public static void main(String[] args) {
       JFrame2 nf = new JFrame2();
                nf.JFrame2();

                 Insets insets = nf.getInsets();
//
//                 System.out.println(insets.top);
//                 System.out.println(insets.bottom);
//                 System.out.println(insets.left);
//                 System.out.println(insets.right);
             }
 }


