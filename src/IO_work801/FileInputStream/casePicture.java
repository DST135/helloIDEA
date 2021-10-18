package IO_work801.FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : IO_work801.FileInputStream
 * @ClassName : casePicture.java
 * @createTime : 2021/8/4 16:56
 * @Description :案例：复制图片
 */
public class casePicture {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\chen9\\Desktop\\tie.jpg");
        FileOutputStream fos=new FileOutputStream("tieCopy.jpg");
        byte[] b=new byte[1024];
        int len;
        while((len=fis.read(b))!=-1){
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
