package Hash_work724;

import java.util.HashSet;
import java.util.Set;

public class hashTest implements Cloneable{
    int name;
    String fuck;
    hashTest(int name,String fuck){
        this.name=name;
        this.fuck=fuck;

    }
    public String toString(){
        return "hashTest[name="+name+",fuck="+fuck+"]";
    }
    public static void main(String[] args){
        hashTest c=new hashTest(1,"fuck you!");
        hashTest c2=new hashTest(1,"fuck you!");
        try{
            hashTest c3=(hashTest)c.clone();
            System.out.println(c3.name);
        }catch(CloneNotSupportedException e){

        }
        
        Set s=new HashSet();
        s.add(c);
        System.out.println(c.toString());
        System.out.println(c.equals(c2));
        System.out.println(c==c2);
        System.out.println(c.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(s.contains(c));
        System.out.println(c.getClass());
        System.out.println(Language.CHINESE);
    }

}

