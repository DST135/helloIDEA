package Collection_work725;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出
public class SetPractice {
    public static void main(String[] args){
        Random r=new Random();
        Set<Integer> s1=new TreeSet<>();//得到结果有序
        Set<Integer> s2=new HashSet<>();//得到结果无序
        int temp;
        //(1)
        for(int i=0;i<10;){
            temp=r.nextInt(19)+1;
            boolean b=s1.add(temp);
            if(b) i++;
        }
        //(2)
        while(s2.size()<10){
            temp=r.nextInt(19)+1;
            s2.add(temp);
        }

        for(Integer i:s1){
            System.out.println(i);
        }
        System.out.println("-----------");
        for(Integer i:s2){
            System.out.println(i);
        }
    }
}
