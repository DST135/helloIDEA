package Collection_work725.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//map的遍历
public class mapBianli {
    public static void main(String[] args){
        Map<Object,String> m=new HashMap<>();
        m.put(1, "value1");
        m.put(2, "value2");
        m.put(3, "value3");
        m.put(4, "value4");

        //(1)
        Set<Object> s=m.keySet();

        for(Object o:s){
            System.out.println(o+" "+m.get(o));
        }
        
        //(2)
        Set<Map.Entry<Object,String>> kv=m.entrySet();
        for(Map.Entry<Object,String> i:kv){
            System.out.println(i.getKey()+" "+i.getValue());
        }
    }
}
