package UDP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class GuanBoJieShou extends JFrame implements Runnable, ActionListener {
    int port;//端口
    InetAddress group = null;//广播
    MulticastSocket socket = null;
    JButton inceBtn = new JButton("开始接收");
    JButton stopBtn = new JButton("停止接收");
    JTextArea inceAr = new JTextArea(10,10);
    JTextArea inced = new JTextArea(10,10);
    Thread thread;
    boolean stop = false;
    public GuanBoJieShou(){
        setTitle("广播据报");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thread = new Thread(this);
        inceBtn.addActionListener(this);
        stopBtn.addActionListener(this);
        inceAr.setForeground(Color.BLUE);
        JPanel north = new JPanel();
        north.add(inceBtn);
        north.add(stopBtn);
        add(north,BorderLayout.NORTH);
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(1,2));//行列
        center.add(inceAr);
        center.add(inced);
        add(center,BorderLayout.CENTER);
        validate();//刷新
        port = 9898;
        try {
            group = InetAddress.getByName("224.255.10.0");
            socket = new MulticastSocket(port);
            socket.joinGroup(group);//加入多点广播地址
        } catch (IOException e) {
            e.printStackTrace();
        }

        setBounds(500,500,360,380);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==inceBtn){
            inceBtn.setBackground(Color.red);
            stopBtn.setBackground(Color.gray);
            if(!(thread.isAlive())){
                thread = new Thread(this);
            }
            thread.start();
            stop = false;
        }
        if(e.getSource()==stopBtn){
            inceBtn.setBackground(Color.yellow);
            stopBtn.setBackground(Color.red);
            stop = true;
        }

    }

    @Override
    public void run() {
        while(!stop){
            byte data[] = new byte[1024];
            DatagramPacket packet =null;
            packet = new DatagramPacket(data,data.length,group,port);
            try {
                socket.receive(packet);//接收数据添加到packet中
                //获取数据包内容
                String message = new String(packet.getData(),0,packet.getLength());//只要发送方一直发送packet中就就一直接收存储发送过来的信息
                inceAr.setText("正在接收的内容:\n"+message);//左边文本框
                inced.append(message+"\n");//右边文本框//append是追加到文本框中不想是setText是添加到文本框中会覆盖原来的内容
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args){
        GuanBoJieShou rec = new GuanBoJieShou();
        rec.setSize(460,200);
    }
}
