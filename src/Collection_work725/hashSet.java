package Collection_work725;

import java.util.HashSet;
//源代码操作自动重写hashCode()和equals()方法
public class hashSet {
    public static void main(String[] args){
        HashSet<Student> student=new HashSet<>();
        Student s1=new Student(1);
        Student s2=new Student(2);
        Student s3=new Student(3);
        Student s4=new Student(1);
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        for(Student s:student){
            System.out.println(s.code);
        }

    }
}

class Student{
    int code;
    public Student(int code){
        this.code=code;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + code;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (code != other.code)
            return false;
        return true;
    }
    
}

