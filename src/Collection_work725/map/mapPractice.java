package Collection_work725.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapPractice {
    public static void main(String[] args){
        StudentTest s1=new StudentTest(12,"da");
        StudentTest s2=new StudentTest(15,"d33");
        StudentTest s3=new StudentTest(11,"d44");
        Map<String,StudentTest> ms=new HashMap<>();
        ms.put("U01", s1);
        ms.put("U02", s2);
        ms.put("U03", s3);

        Set<String> se=ms.keySet();
        for(String i:se){
            System.out.println("key:"+i+" "+"value:"+(ms.get(i)).getAge());
        }
    }
}
