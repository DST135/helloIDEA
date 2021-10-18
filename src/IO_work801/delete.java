package IO_work801;

import java.io.File;
import java.io.IOException;
/**
 * FiLe类删除功能
 * public boolean delete（）：删除由此抽象路径名表示的文件或目录
 */
public class delete {
    public static void main(String[] args) throws IOException{
        //在当前目录下创建txt文件 //删除txt文件
        File f1=new File("test.txt");
        //System.out.println(f1.createNewFile());
        System.out.println(f1.delete());

        //创建目录 删除目录
        File f2=new File("test");
        //System.out.println(f2.mkdir());
        System.out.println(f2.delete());

        //创建目录下的文件，并删除
        File f3 =new File("test");
        System.out.println(f3.mkdir());
        File f4 =new File("test/test1.txt");
        System.out.println(f4.createNewFile());

        //System.out.println(f3.delete());//false 如果一个文件夹不为空，需要先删除里面所有文件再删除文件夹
        f4.delete();
        System.out.println(f3.delete());


        


    }

}