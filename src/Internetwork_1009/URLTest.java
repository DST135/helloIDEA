package Internetwork_1009;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : Internetwork_1009
 * @ClassName : URLTest.java
 * @createTime : 2021/10/21 10:05
 * @Description :URL网络编程
 * 1.URL：统一资源定位符，对应着互联网的某一资源地址
 * 2.格式：http://Localhost：8080/examples/beauty.jpg？username=Tom
 *         协议    主机名   端口号      资源地址（文件路径）      参数列表（查询名）
 */
public class URLTest {
    public static void main(String[] args) {
        URL url;
        try {
            url = new URL("https://www.bilibili.com/video/BV1Z44y1x7ov?spm_id_from=333.851.b_7265636f6d6d656e64.1");
            System.out.println(url.getProtocol());
//            public String getProtocol( ) 获取该URL的协议名
            System.out.println(url.getHost());
//            public String getHost( ) 获取该URL的主机名
            System.out.println(url.getPort());
//            public String getPort( ) 获取该URL的端口号
            System.out.println(url.getPath());
//            public String getPath( ) 获取该URL的文件路径
            System.out.println(url.getFile());
//            public String getFile( ) 获取该URL的文件名
            System.out.println(url.getQuery());
//            public String getQuery( ) 获取该URL的查询名
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
