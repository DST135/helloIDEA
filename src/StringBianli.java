public class StringBianli {
    public static void main(String[] args){
        String str="2019 come on";
        // 方法一
        for(int i=0;i < str.length();i++) {
            System.out.println(str.charAt(i));
            /**charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
             * public char charAt(int index)
             */
        }

        //方法二

        for(int i=0;i < str.length();i++) {
            System.out.println(str.substring(i,i+1));
            /**返回字符串的子字符串。
             * (1)public String substring(int beginIndex)
             * (2)public String substring(int beginIndex, int endIndex)
             */          
        }

        //方法三

        char[]  c = str.toCharArray();
        /**toCharArray() 方法将字符串转换为字符数组。
         * public char[] toCharArray()
         */
        for(int i=0;i < c.length;i++) {
            System.out.println(c[i]);
        }
    }
}

/**
 * java length,length(),size()的区别
1 java中的length属性是针对数组说的,比如说你声明了一个数组,想知道这个数组的长度则用到了length这个属性.
2 java中的length()方法是针对字符串String说的,如果想看这个字符串的长度则用到length()这个方法.
3.java中的size()方法是针对泛型集合说的,如果想看这个泛型有多少个元素,就调用此方法来查看!
这个例子来演示这两个方法和一个属性的用法
public static void main(String[] args) {
String []list={"ma","cao","yuan"};
String a="macaoyuan";
System.out.println(list.length);
System.out.println(a.length());
List<Object> array=new ArrayList();
array.add(a);
System.out.println(array.size());
}
输出的值为:
3
9
1
 */