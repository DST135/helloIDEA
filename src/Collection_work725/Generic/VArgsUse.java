package Collection_work725.Generic;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Arrays工具类中有一个静态方法：
	• · public static<T> List<T> aslist（T…a）：返回由指定数组支持的固定大小的列表
	• 返回的集合不能做增删操作，可以修改
List接口中有一个静态方法
	• · public static<E> List<E> of(E… elements）：返回包含任意数量元素的不可变列表
	• 返回的集合不能做增删改操作
Set接口中有一个静态方法
	• public static<E>Set<E> of（E…elements）：返回个包含任意数量元素的不可变集合
	• 返回的集合不能做增删操作，没有修改的方法
 */

public class VArgsUse {
    public static void main(String[] args){
        List<String> ls=Arrays.asList("woow","jjian","hbh");
        //ls.add("sdf");
        //ls.remove("woow");//UnsupportedOperationException ，asList()方法产生固定长度的list
        ls.set(2, "hello");
        System.out.println(ls);
/**异常原因：
 * 调用Arrays.asList()产生的List的add、remove方法时报异常，这是由Arrays.asList() 返回的是Arrays的内部类ArrayList， 而不是java.util.ArrayList。
 * Arrays的内部类ArrayList和java.util.ArrayList都是继承AbstractList，remove、add等方法AbstractList中是默认throw UnsupportedOperationException而且不作任何操作。
 * java.util.ArrayList重写了这些方法而Arrays的内部类ArrayList没有重写，所以会抛出异常。
 */

        List<String> lt=List.of("hello","world","tie");
        // lt.add("add");
        // lt.remove("hello");
        // lt.set(2, "element");//UnsupportedOperationException 
        System.out.println(lt);

        //Set<String> s=Set.of("tie","tie","zui","mei");//IllegalArgumentException 非法或不正确参数,set不能有重复元素
        Set<String> s=Set.of("tie","zui","mei");
        //s.add("add");
        //s.remove("remove");//UnsupportedOperationException 
        System.out.println(s);
    }
}
