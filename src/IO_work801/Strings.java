package IO_work801;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 铁铁
 * @Project : helloIDEA
 * @Package : IO_work801
 * @ClassName : Strings.java
 * @createTime : 2021/8/7 18:56
 * @Description :字符串的编码解码
 */
public class Strings {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="中国";
        byte[] b1= s.getBytes();//[-28, -72, -83, -27, -101, -67]默认UTF—8，采用三个字节存储一个汉字
        System.out.println(Arrays.toString(b1));
        //System.out.println(new String(b1));
        byte[] b2 = s.getBytes("GBK");//[-42, -48, -71, -6],两个字节一个汉字
        System.out.println(Arrays.toString(b2));
        System.out.println(new String(b2));//�й�,编码与解码规则不统一
        System.out.println(new String(b1,"GBK"));//涓浗，编码与解码规则不统一


    }

}
