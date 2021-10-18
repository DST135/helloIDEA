package Hash_work724;

public class singleton {
    public int i=0;
    public static singleton s=new singleton(23);

    private singleton(int i){
        this.i=i;
    }

    public static singleton gSingleton(){
        return s;
    }
}

class testT{
    public static void main(String[] args){
        singleton s1=singleton.gSingleton();
        System.out.println(s1.i);
    }
}