package Collection_work725.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *Map集合的获取功能：
V get（ Object key）：根据键获取值
Set <K> keyset（）：获取所有键的集合
Collection<v> values（）：获取所有值的集合
Set< Map.Entry<K,V>> entrySet() :获取所有键值对对象的集合
 */
public class maptest3 {
    public static void main(String[] args){
        Map<Object,String> m=new HashMap<>();
        m.put(1, "value1");
        m.put(2, "value2");
        m.put(3, "value3");
        m.put(4, "value4");

        System.out.println(m.get(1));

        Set<Object> s=m.keySet();
        System.out.println(s);

        Collection<String> c=m.values();
        System.out.println(c);

        Set<Map.Entry<Object,String>> kv=m.entrySet();
        System.out.println(kv);//[1=value1, 2=value2, 3=value3, 4=value4]
        System.out.println(m);//{1=value1, 2=value2, 3=value3, 4=value4}
    }
}
