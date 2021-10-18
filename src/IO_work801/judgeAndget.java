package IO_work801;

import java.io.File;
import java.io.IOException;

/**
 * FiLe类的判断和获取功能：
public boolean isDirectory（）：测试此抽象路径名表示的FiLe是否为目录
public boolean isfile（）：测试此抽象路径名表示的FiLe是否为文件
public boolean exists（）：测试此抽象路径名表示的FiLe是否存在
public String getAbsolutePath（）：返回此抽象路径名的绝对路径名字符串
public String getPath（）：将此抽象路径名转换为路径名字符串
public String getName（）：返回由此抽象路径名表示的文件或目录的名称
public String[] list（）：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
public File[] ListFiles（）：返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */
public class judgeAndget {
    public static void main(String[] args) throws IOException{
        File f1=new File("test/test.txt");
        File f2=new File("test");

        //测试判断
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        //获取
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());

        System.out.println("----------");
        String[] s1=f2.list();
        for(String s:s1){
            System.out.println(s);
        }
        System.out.println("----------");
        File[] F=f2.listFiles();
        for(File fi:F){
            // System.out.println(fi);
            if(fi.isFile()){
                System.out.println(fi.getName());
            }
        }

    }
}
