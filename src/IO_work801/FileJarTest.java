package IO_work801;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : IO_work801
 * @ClassName : FileJarTest.java
 * @createTime : 2021/10/1 11:38
 * @Description :第三方jar包练习
 */
public class FileJarTest {
    public static void main(String[] args) {
        File f1 = new File("test.txt");
        File f2 = new File("test2.txt");

        try {
            FileUtils.copyFile(f1,f2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
