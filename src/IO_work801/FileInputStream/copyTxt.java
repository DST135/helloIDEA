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
 * @ClassName : copyTxt.java
 * @createTime : 2021/8/3 16:31
 * @Description :文本复制
 */
public class copyTxt {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1=new FileInputStream("C:\\Users\\chen9\\Desktop\\黑马.txt");
        FileOutputStream fis2=new FileOutputStream("copy.txt");
        int i;
        while((i=fis1.read())!=-1){
            fis2.write(i);
        };
        fis1.close();
        fis2.close();
    }
}
