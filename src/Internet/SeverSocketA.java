package Internet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverSocketA {
    private ServerSocket server;
    private Socket socket;
    public void start1() throws IOException {
        server = new ServerSocket(8998);
        System.out.println("服务器套接字已经创建成功");
        while(true){
            System.out.println("等待客服机的连接");
            socket = server.accept();
            //根据 套接字字节流创建字符流输入
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true){
                String message = reader.readLine();
                if("exit".equals(message)){
                    System.out.println("客户机退出");
                    break;
                }
                System.out.println("客户机"+message);
            }
            reader.close();
            reader.close();
        }
    }
    public static void main(String[] args){
        SeverSocketA seversovket1 = new SeverSocketA();
        try {
            seversovket1.start1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
