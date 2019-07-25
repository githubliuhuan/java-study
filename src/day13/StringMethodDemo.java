package day13;
/*
String类适用于描述字符串事物
那么它就提供了多个方法对字符串进行操作

常见的操作？
1.获取
    1.1 int length() 获取长度
    1.2 根据位置获取位置上某个字符。
        char charAt(int index)
    1.3 根据字符获取该字符在字符串中位置。
        int indexOf(int ch)：返回的是ch在字符串中第一次出现的位置。
        int indexOf(int ch, int fromIndex)：从fromIndex指定位置开始，获取ch在字符串中出现的位置。
        int indexOf(String ch)：返回的是str在字符串中第一次出现的位置。
        int indexOf(String ch, int fromIndex)：从fromIndex指定位置开始，获取str在字符串中出现的位置。

2.判断
    2.1 字符串中是否包含某一个子串
        boolean contains(str)
        特殊之处：indexOf(str):可以索引str第一次出现位置，如果返回-1，表示该str不在字符串中存在。
        所以，也可以用于对指定字符串判断是否包含。
        if(str.indexOf("aa")!=-1)

        而且该方法既可以判断，也可以获取出现的位置
    2.2 字符串中是否有内容
        boolean isEmpty():原理就是判断长度是否为0
    2.3 字符串中是否是以指定内容开头
        boolean startswith(str);
    2.4 字符串中是否是以指定内容结尾
        boolean endswith(str);
    2.5 判断字符串内容是否相同，复写了Object类中的equals方法。
        boolean equals(str);
    2.6 判断内容是否相同，并忽略大小写。
        boolean equalsIgnoreCase();

3.转换
    3.1 将字符数组转成字符串。
        构造函数:String(char[])
                String(char[],offset,count)：将字符数组中的一部分转成字符串。
        静态方法：
                static String copyValueOf(char[]);
                static String copyValueOf(char[] data,int offset,int count)
                static String valueOf(char[]);

    3.2 将字符串转成字符数组。
        char[] toCharArray();
    3.3 将字节数组转成字符串。
        String(byte[])
        String(byte[],offset,count)
    3.4 将字符串转成字节数组。
        byte[] getBytes()
    3.5 将基本数据类型转成字符串。
        static String valueOf(int)
        static String valueOf(double)
        3+""; // String.valueOf(3);

        特殊：字符串和字节数组在转换过程中，是可以指定编码表的。

4.替换
    String replace(oldchar,newchar);

5.切割
    String[] split(regex)

6.子串，获取字符串中的一部分
    String substring(begin);
    String sustring(begin,end);

7.转换，去除空格，比较。
    7.1 将字符串转成大写或者小写。
        String toUpperCase();
        String toLowerCase();

    7.2 将字符串两端的多个空格去除。
        String trim();

    7.3 对两个字符串进行自然顺序比较。
        int compareTo(string);
 */


public class StringMethodDemo {
    public static void method_7()
    {
        String s = "   Hello Java   ";
        sop(s.toLowerCase());
        sop(s.toUpperCase());
        sop(s.trim());

        String s1 = "abc";
        String s2 = "aaa";
        sop(s1.compareTo(s2));

    }



    public static void method_sub()
    {
        String s = "abcdef";
        sop(s.substring(2)); // 从指定位置开始到结尾,如果角标不存在，会出现字符串角标越界异常。
        sop(s.substring(2,4));// 包含头，不包含尾。s.substring(0,s.length());

    }



    public static void method_split()
    {
        String s = "zhangsan,lisi,wangwu";
        String[] arr = s.split(",");
        for(int x=0;x<arr.length;x++)
        {
            sop(arr[x]);
        }
    }



    public static void method_replace()
    {
        String s = "hello java";
        // String s1 = s.replace('a','n');// 如果要替换的字符不存在，返回的还是原字符串。
        sop("s="+s);
        String s1 = s.replace("hello","world");
        sop("s1="+s1);

    }



    public static void method_trans()
    {
        char[] arr = {'a','b','c','d','e','f'};
        String s = new String(arr);
        sop("s="+s);

        String s1 = "gegejglg";

        char[] chs = s1.toCharArray();
        for(int x=0; x<chs.length; x++)
        {
            sop("ch="+chs[x]);
        }
    }

    public static void method_is()
    {
        String str = "ArrayDemo.java";
        sop(str.startsWith("Array"));
        sop(str.endsWith(".java"));
        sop(str.contains("Demo"));

    }

    public static void method_get()
    {
        String str = "abcdef";
        // 长度
        sop(str.length());// System.out.println(str.length());


        // 根据索引获取字符
        sop(str.charAt(4));// 当访问到字符串中不存在的角标时会发生StringIndexOutOfBoundsException。


        // 根据字符获取索引
        sop(str.indexOf('a',3)); // 如果没有找到，返回-1
        sop(str.lastIndexOf('a'));

    }


    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = new String("abc");
//
//        String s3 = "abc";
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
       // method_get();
       // method_is();
       // method_trans();
       // method_replace();
        method_split();
    }

    public static void sop(Object obj)
    {
        System.out.println(obj);
    }
}
