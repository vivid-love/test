package Internet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class UserSocketA extends JFrame {
    private PrintWriter writer;
    Socket socket;
    private JTextArea area = new JTextArea();
    private JTextField text = new JTextField();
    public UserSocketA(){
        setTitle("向服务器送数据");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        JScrollPane scrollPane = new JScrollPane(area);
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        c.add(text,"South");
        text.setText("你好，今天天气很好！");
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writer.println(text.getText().trim());
                area.append(text.getText()+'\n');
                text.setText("");
            }
        });
    }
    private void connect(){
        area.append("尝试连接\n");
        try {
            socket = new Socket("127.0.0.1",8998);
            writer = new PrintWriter(socket.getOutputStream(),true);
            area.append("完成连接\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        UserSocketA userSocketA = new UserSocketA();
        userSocketA.setSize(200,200);
        userSocketA.setVisible(true);
        userSocketA.connect();
    }
}
