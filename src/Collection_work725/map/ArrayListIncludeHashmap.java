package Collection_work725.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//集合嵌套练习
//(1)创建一个 ArrayList集合，存储三个元素，每一个元素都是 HashMap，每一个 HashMap的键和值都是 String，并遍历
//(2)创建一个 HashMap集合，存储三个键值对元素，每一个键值对元素的键是 String，值是 ArrayList，每一个 ArrayList的元素是 String，并遍历
public class ArrayListIncludeHashmap {
    /**
     * 
     * @param args
     * public static void main(String[] args){
        ArrayList<Map<String,String>> h=new ArrayList<Map<String,String>>();
        Map<String,String> m1=new HashMap<>();
        Map<String,String> m2=new HashMap<>();
        Map<String,String> m3=new HashMap<>();

        m1.put("key1", "value1");
        m1.put("key2", "value2");
        m1.put("key3", "value3");

        m2.put("key11", "value11");
        m2.put("key22", "value22");
        m2.put("key33", "value33");

        m3.put("key111", "value111");
        m3.put("key333", "value333");
        m3.put("key222", "value222");
        

        h.add(m3);
        h.add(m1);
        h.add(m2);
        

        for(Map<String,String> a:h){
            Set<Map.Entry<String,String>> kv=a.entrySet();
            for(Map.Entry<String,String> mm:kv){
                System.out.println(mm.getKey()+" "+mm.getValue());
            }

            // Set<String> ss=a.keySet();
            // for(String s:ss){
            //     System.out.println(s+" "+a.get(s));
            // }
            
        }
    }
     */
    
    public static void main(String[] args){
        HashMap<String,ArrayList<String>> hs=new HashMap<>();
        ArrayList<String> a1=new ArrayList<>();
        ArrayList<String> a2=new ArrayList<>();
        ArrayList<String> a3=new ArrayList<>();

        a1.add("诸葛亮");
        a1.add("刘备");

        a2.add("？");
        a2.add(",");

        a3.add("tie");
        a3.add("mei");

        hs.put("key1", a1);
        hs.put("key2", a2);
        hs.put("key3", a3);

        Set<Map.Entry<String,ArrayList<String>>> kv=hs.entrySet();
        for(Map.Entry<String,ArrayList<String>> x:kv){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }

}
