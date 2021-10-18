package Collection_work725.map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;



/**
 * 需求：键盘录入一个字符串，要求统计字符串中每个字符出现的次数。
举例：键盘录入" aababcabcdabcde "在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
 */
public class mapPractice3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s=sc.nextLine();
        //HashMap<Character,Integer> h=new HashMap<>();//数字有排序，而字母没有排序
        TreeMap<Character,Integer> h=new TreeMap<>();//同treeset,有默认排序
        char[]  c = s.toCharArray();
        for(int i=0;i < c.length;i++) {
            if(h.get(c[i])==null){
                h.put(c[i], 1);
            }
            else{
                h.put(c[i],h.get(c[i])+1);
            }
        }
        //StringBuffer ss=new StringBuffer();
        StringBuilder ss=new StringBuilder();
        Set<Character> se=h.keySet();
        for(Character ch:se){
            ss.append(ch).append("(").append(h.get(ch)).append(")");
        }
        System.out.println(ss);
    }
}
