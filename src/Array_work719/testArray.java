package Array_work719;

import java.util.Arrays;

public class testArray {
    public static void main(String[] args){
        //learnArray();
        learn2DArray();
    }

    static void learnArray(){
        int[] nums={1,5,7,3,2};
        String[] names={"tie","hai","yan","tii"};
        Arrays.sort(names);
         
        for(String name:names){
            System.out.println(name);
        }
        
    }

    public static void learn2DArray(){
        //定义
        int[][] nums={{1,2,3},{4,3,5,6},{7}};
        String[][] names={{"tie","hai"},{"yan","diao"},{"tom","ren","yi"}};
        String[][] names2=new String[3][4];
        //访问和遍历
        //System.out.println(nums[2][0]);
        //System.out.println(names[1][1]);
        int flag=0;
        int row=-1;
        int col=-1;
        for(int i=0;i<names.length;i++){
            String[] nameA=names[i];
            for(int j=0;j<nameA.length;j++){
                if(nameA[j]=="tom" || nameA[j]=="diao"){
                    if(row<0){
                        row=i;
                        col=j;
                        continue;
                    }
                    String temp=names[i][j];
                    names[i][j]=names[row][col];
                    names[row][col]=temp;
                    flag=1;
                    break;                  
                    //System.out.println("tom在第"+i+"行"+j+"列");
                    //flag=1;
                }
            }
            if(flag==1) break;
        }
        for (String[] date : names){

            /* for (int date : row){
                 System.out.printf("%d\t",date);
             }*/
 
             System.out.println(Arrays.toString(date));
 
         }
    }
}

