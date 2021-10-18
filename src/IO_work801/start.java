package IO_work801;

import java.io.File;
import java.io.IOException;
/**
 * FiLe类创建功能
 * public boolean createNewFile（）：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
 * public boolean mkdir（）：创建由此抽象路径名命名的目录
 * public boolean mkdirs（）：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
 */
public class start {
    public static void main(String[] args) throws IOException{
        //public boolean createNewFile（）
        //如果文件不存在就创建，返回true，如果文件存在，就不创建文件，并返回false
        File f1=new File("E:/joice/Java/fileTest/test.txt");
        System.out.println(f1.createNewFile());

        //public boolean mkdir（）
        //如果目录不存在就创建，返回true，如果目录存在，就不创建目录，并返回false
        File f2=new File("E:/joice/Java/fileTest2");
        System.out.println(f2.mkdir());

        //public boolean mkdirs（）多级目录
        File f3=new File("E:/joice/Java/fileTest3/file.txt");//创建出的“file.txt”仍未文件夹而不是txt文件,所以应该根据调用的方法判断最终结果
        //System.out.println(f3.mkdir()); //false
        System.out.println(f3.mkdirs());

        File f4=new File("E:/joice/Java/fileTest3/file.txt");
        System.out.println(f4.createNewFile());//false 不能创建与已有文件夹重名的文件

    }
}
