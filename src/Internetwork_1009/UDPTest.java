package Internetwork_1009;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : Internetwork_1009
 * @ClassName : UDPTest.java
 * @createTime : 2021/10/21 9:26
 * @Description :UDP协议网络编程
 */
public class UDPTest {
    @Test
    public void sender() throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String s = "UDP发射导弹";
        byte[] buffer = s.getBytes();
        InetAddress id = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(buffer,buffer.length,id,9090);

        ds.send(dp);
        ds.close();

    }

    @Test
    public void receiver() throws IOException {
        DatagramSocket ds = new DatagramSocket(9090);
        byte[] data = new byte[100];
        DatagramPacket dp = new DatagramPacket(data,data.length);
        ds.receive(dp);
        System.out.println(new String(dp.getData(),0,dp.getLength()));
    }
}
