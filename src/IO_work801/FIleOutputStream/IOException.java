package IO_work801.FIleOutputStream;

import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : IO_work801.FIleOutputStream
 * @ClassName : IOException.java
 * @createTime : 2021/8/3 15:47
 * @Description :字节流写数据加异常处理
 */
public class IOException extends Throwable {
    public static void main(String[] args) {
        FileOutputStream f=null;
        try {
            f=new FileOutputStream("test.txt");
            f.write("hello".getBytes());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }finally {
            if (f != null) { //f=null时close()会抛出异常
                try {
                    f.close();//放在finally下防止catch到IOException后无法释放资源
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
