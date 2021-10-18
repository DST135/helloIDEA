package Collection_work725.map;

import java.util.HashMap;
import java.util.Map;
/**
 * public interface Map<K,V>
将键映射到值的对象。 地图不能包含重复的键; 每个键可以映射到最多一个值。
 */
public class maptest {
    public static void main(String[] args){
        Map<Integer,String> m=new HashMap<>();//底层哈希表保证key的唯一性
        //put(K key, V value) 将指定的值与该映射中的指定键相关联（可选操作）。
        m.put(1, "value1");
        m.put(2, "value2");
        m.put(3, "value3");
        m.put(3, "value4");//key重复时，会与最后一个value匹配

        System.out.println(m);
    }
}
