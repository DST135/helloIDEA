package work723;

public class reverse {
    public static void main(String[] args){
        int[] b={1,7,5,2,8};
        int temp=0;
        for(int i=0;i<b.length/2;i++){
            temp=b[i];
            b[i]=b[b.length-i-1];
            b[b.length-i-1]=temp;
        }
        for(int n:b){
            System.out.println(n);
        }
        
    }
}
