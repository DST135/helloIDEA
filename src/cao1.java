import java.util.HashSet;
import java.util.Set;

public class cao1 {
    public static void main(String[] args){
        Set<String> student=new HashSet<>();
        student.add("tie");
        student.add("zui");
        student.add("tie");
        student.add("mei");

        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("忒忒".hashCode());
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
