package Collection_work725.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ColLections类的概述:是针对集合操作的工具类
 * Collections类的常用方法
public static< T extends Comparable<? super T>> void sort(List<T>list)：将指定的列表按升序排序
public static void reverse（ List<？>list：反转指定列表中元素的顺序
public static void shuffle（List<？>list）：使用默认的随机源随机排列旨定的列表

 */
public class CollectionsTest {
    public static void main(String[] args){
        List<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(3);
        li.add(5);
        li.add(4);
        li.add(2);

        System.out.println("原始");
        for(Integer i:li){
            System.out.println(i);
        }

        System.out.println("颠倒");
        Collections.reverse(li);
        for(Integer i:li){
            System.out.println(i);
        }

        System.out.println("排序");
        Collections.sort(li);
        for(Integer i:li){
            System.out.println(i);
        }

        System.out.println("随机");
        Collections.shuffle(li);
        for(Integer i:li){
            System.out.println(i);
        }
    }

}
