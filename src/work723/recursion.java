package work723;

public class recursion {
    public static void main(String[] args){
        System.out.println(jiecheng(3));
    }

    static int jiecheng(int m){
        if(m-1==0){
            return m;
        } 
        else{
            return m*jiecheng(m-1);
        }
        
    }
}
