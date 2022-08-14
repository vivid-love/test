package newframe;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import aftersuccess.Aftersuccess;

//import aftersuccess.Aftersuccess;

//import course.Course;

public class Panel22 extends JFrame {

    private JPanel contentPane;
    private int screenWidth;
    private int screenHeight;
    private int page = 1;
    private JPanel returnJPanel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Panel22 frame = new Panel22();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     *
     * @throws InterruptedException
     */
    public Panel22() throws InterruptedException {

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth = (int) dimension.getWidth();//获得屏幕得宽1920
        screenHeight = (int) dimension.getHeight();//获得屏幕得高1080

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setBounds(0, 0, 1920, 1080);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JPanel jPanel11JPanel = new JPanel();
        jPanel11JPanel.setBounds(0, 0, 1750, 900);
        ImageIcon icon = new ImageIcon("D:\\Document\\course\\A1.jpg");
        JLabel jLabel1JLabel = new JLabel(icon);
        jPanel11JPanel.add(jLabel1JLabel);
        contentPane.add(jPanel11JPanel);
        returnJPanel=jPanel11JPanel;


        JButton upButton = new JButton("上一页");
        upButton.setBounds((int) (screenWidth / 3) - 90, screenHeight - 180, 180, 90);
        contentPane.add(upButton);

        //下一页按钮事件
        JButton nextButton = new JButton("下一页");
        nextButton.setBounds(screenWidth - (int) (screenWidth / 3) - 90, screenHeight - 180, 180, 90);
        contentPane.add(nextButton);
        nextButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(Panel22.this.page==1){
                    Panel22.this.page++;
                }
                Panel22.this.returnJPanel = execution(Panel22.this.page,Panel22.this.returnJPanel);
                Panel22.this.page++;
                System.out.println("  page:   "+Panel22.this.page);
            }
        });


    }

    private JPanel execution(int exPage, JPanel newjJPanel) {
        JPanel returnJPanel = null;
        switch (exPage) {
            case 1:
                returnJPanel = imageJPane1(newjJPanel);
                break;
            case 2:
                returnJPanel = imageJPane2(newjJPanel);
                break;
            case 3:
                returnJPanel = imageJPane3(newjJPanel);
                break;
            case 4:
                returnJPanel = imageJPane4(newjJPanel);
                break;
            default:
                break;
        }
        return returnJPanel;
    }

    //第二张图片
    private JPanel imageJPane2(JPanel beforejPanel2) {
        BufferedImage bufferedImage;
        int imageWidth = 0;
        int imageHeight = 0;
        try {
            bufferedImage = ImageIO.read(new FileInputStream("D:\\Document\\course\\A2.jpg"));
            imageWidth = bufferedImage.getWidth();
            imageHeight = bufferedImage.getHeight();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        int locationx = (int) ((this.screenWidth - imageWidth) / 2);
        int locationy = (int) ((this.screenHeight - imageHeight) / 2) - 90;
        System.out.println(locationx + "     " + locationy);

        contentPane.remove(beforejPanel2);
        contentPane.revalidate();
        contentPane.repaint();
        JPanel jPanel12JPanel = new JPanel();
        jPanel12JPanel.setBounds(locationx, locationy, imageWidth, imageHeight);
        ImageIcon icon2 = new ImageIcon("D:\\Document\\course\\A2.jpg");
        JLabel jLabel12JLabel = new JLabel(icon2);
        jPanel12JPanel.add(jLabel12JLabel);
        contentPane.add(jPanel12JPanel);
        return jPanel12JPanel;
    }

    //第一张图片
    private JPanel imageJPane1(JPanel beforejPanel1) {
        BufferedImage bufferedImage;
        int imageWidth = 0;
        int imageHeight = 0;
        try {
            bufferedImage = ImageIO.read(new FileInputStream("D:\\Document\\course\\A1.jpg"));
            imageWidth = bufferedImage.getWidth();
            imageHeight = bufferedImage.getHeight();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        int locationx = (int) ((this.screenWidth - imageWidth) / 2);
        int locationy = (int) ((this.screenHeight - imageHeight) / 2) - 90;
        System.out.println(locationx + "     " + locationy);

        contentPane.remove(beforejPanel1);
        contentPane.revalidate();
        contentPane.repaint();
        JPanel jPanel11JPanel = new JPanel();
        jPanel11JPanel.setBounds(locationx, locationy, imageWidth, imageHeight);
        ImageIcon icon1 = new ImageIcon("D:\\Document\\course\\A1.jpg");
        JLabel jLabel11JLabel = new JLabel(icon1);
        jPanel11JPanel.add(jLabel11JLabel);
        contentPane.add(jPanel11JPanel);
        return jPanel11JPanel;
    }

    //第三张图片
    private JPanel imageJPane3(JPanel beforejPanel3) {
        BufferedImage bufferedImage;
        int imageWidth = 0;
        int imageHeight = 0;
        try {
            bufferedImage = ImageIO.read(new FileInputStream("D:\\Document\\course\\A3.jpg"));
            imageWidth = bufferedImage.getWidth();
            imageHeight = bufferedImage.getHeight();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        int locationx = (int) ((this.screenWidth - imageWidth) / 2);
        int locationy = (int) ((this.screenHeight - imageHeight) / 2) - 90;
        System.out.println(locationx + "     " + locationy);

        contentPane.remove(beforejPanel3);
        contentPane.revalidate();
        contentPane.repaint();
        JPanel jPanel13JPanel = new JPanel();
        jPanel13JPanel.setBounds(locationx, locationy, imageWidth, imageHeight);
        ImageIcon icon2 = new ImageIcon("D:\\Document\\course\\A3.jpg");
        JLabel jLabel13JLabel = new JLabel(icon2);
        jPanel13JPanel.add(jLabel13JLabel);
        contentPane.add(jPanel13JPanel);
        return jPanel13JPanel;
    }

    //第四张图片
    private JPanel imageJPane4(JPanel beforejPanel4) {
        BufferedImage bufferedImage;
        int imageWidth = 0;
        int imageHeight = 0;
        try {
            bufferedImage = ImageIO.read(new FileInputStream("D:\\Document\\course\\A4.jpg"));
            imageWidth = bufferedImage.getWidth();
            imageHeight = bufferedImage.getHeight();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        int locationx = (int) ((this.screenWidth - imageWidth) / 2);
        int locationy = (int) ((this.screenHeight - imageHeight) / 2) - 90;
        System.out.println(locationx + "     " + locationy);

        contentPane.remove(beforejPanel4);
        contentPane.revalidate();
        contentPane.repaint();
        JPanel jPanel14JPanel = new JPanel();
        jPanel14JPanel.setBounds(locationx, locationy, imageWidth, imageHeight);
        ImageIcon icon2 = new ImageIcon("D:\\Document\\course\\A4.jpg");
        JLabel jLabel14JLabel = new JLabel(icon2);
        jPanel14JPanel.add(jLabel14JLabel);
        contentPane.add(jPanel14JPanel);
        return jPanel14JPanel;
    }
}