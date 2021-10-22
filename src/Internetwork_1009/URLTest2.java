package Internetwork_1009;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : Internetwork_1009
 * @ClassName : URLTest2.java
 * @createTime : 2021/10/21 10:41
 * @Description :
 */
public class URLTest2 {
    public static void main(String[] args) {
        HttpURLConnection huc = null;//多态
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            URL url = new URL("https://cn.bing.com/images/search?view=detailV2&ccid=iTYaIMKz&id=6F2FFBDD7B19E237EE397A7F978C0E61C84E4D2F&thid=OIP.iTYaIMKzcYgBA3Jxscjx4QHaFe&mediaurl=https%3a%2f%2ftse1-mm.cn.bing.net%2fth%2fid%2fR-C.89361a20c2b3718801037271b1c8f1e1%3frik%3dL01OyGEOjJd%252feg%26riu%3dhttp%253a%252f%252fimg.ewebweb.com%252fuploads%252f20191203%252f19%252f1575371608-BEbtWkYMVR.jpg%26ehk%3d8pQ5ZIFRTqZLwxEEbEMy0mA9Ja1c%252fpYXALVOxp7EmhE%253d%26risl%3d%26pid%3dImgRaw%26r%3d0&exph=758&expw=1024&q=%e5%b1%b1%e6%b2%b3%e5%9b%be&simid=608018767696173819&FORM=IRPRST&ck=9BDD01E0D5750F421FB66BBDB9AD7239&selectedIndex=0&ajaxhist=0&ajaxserp=0");
            //获取服务器的连接
            huc = (HttpURLConnection) url.openConnection();
            huc.connect();
            is = huc.getInputStream();
            fos = new FileOutputStream("star.jpeg");
            byte[] buffer = new byte[1024];
            int len;
            while((len=is.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(huc!=null){
                huc.disconnect();
            }
        }






    }
}
