package UDP;

import javax.management.Notification;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.nio.charset.StandardCharsets;

/*
* 设置多点广播，进行参数设置端口，指定发送范围，加入广播组
* 设置广播组地址
* 设置数据包
* 打包数据（数据，数据长度，广播组地址，端口）
* 使用多点广播将数据发送出去
*
*
* */
public class Guangbo extends Thread{
    String weather = "节目预报：八点有大型晚会，请收听！";
    int port = 9898;
    InetAddress inetAddress = null;
    MulticastSocket socket = null;//设置多点广播套接字
    Guangbo(){
        try{
            inetAddress = InetAddress.getByName("224.255.10.0");//广播地址
            socket = new MulticastSocket(port); //实例化多点广播套接字
            socket.setTimeToLive(1);  //指定发送范围是本地网络
            socket.joinGroup(inetAddress);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void run() {
        while (true) {
            DatagramPacket packet = null;//数据包
            byte data[] = weather.getBytes();
            packet = new DatagramPacket(data, data.length, inetAddress, port);//打包数据
            System.out.println(weather);

            try {
                socket.send(packet);//发送数据
                sleep(3000);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {

            }
        }
    }
    public static void main(String[] args){
        Guangbo w = new Guangbo();
        w.start();
    }
}
