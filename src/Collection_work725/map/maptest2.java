package Collection_work725.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map集合的基本功能：
V put（K key, V value）：添加元素
V remove（ object key）：根据键删除键值对元素
void clear（）：移除所有的键值对元素
boolean containsKey（ Object key）：判断集合是否包含指定的键
boolean containsvalue（ Object value）：判断集合是否包含指定的值
booLean isEmpty（）：判断集合是否为空
int size（）：集合的长度，也就是集合中键值对的个数
 */
public class maptest2 {
    public static void main(String[] args){
        Map<Object,String> m=new HashMap<>();
        String s1=m.put("key1", "value1");
        System.out.println(s1); //null
        m.put("key2", "value2");
        m.put("key3", "value3");
        m.put(1, "value4");
        System.out.println(m);

        String s2=m.remove("key2");
        System.out.println(s2);//value2
        m.remove(1, "value5");
        System.out.println(m);
        System.out.println(m.size());

        System.out.println(m.containsKey(2));
        System.out.println(m.containsValue("value1"));

        m.clear();
        System.out.println(m);
    }
}
