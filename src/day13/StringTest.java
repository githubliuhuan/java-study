package day13;
/*
1.模拟一个trim方法，去除字符串两端的空格。
    思路：
    1.判断字符串第一个位置是否是空格，如果是继续向下判断，直到不是空格为止。
    2.当开始和结尾都判断到不是空格时，就是要获取的字符串。

2.将一个字符串进行反转，将字符串中指定部分进行反转，"abc" "cba"
    思路：
    1.曾经学习过对数组的元素进行反转。
    2.将字符串变成数组，对数组进行反转。
    3.将反转后的数组变成字符串。
    4.

*/



public class StringTest {
    public static void sop(String str)
    {
        System.out.println(str);
    }

    public static void main(String[] args) {
        String s = "      ab cd     ";
        sop("("+s+")");
        // s = myTrim(s);
        // sop("("+s+")");
        sop("("+reverseString(s,6,8)+")");
    }

    public static String reverseString(String s,int start,int end)
    {
        char[] chs = s.toCharArray();
        reverse(chs,start,end);
        return new String(chs);
    }



    public static String reverseString(String s)
    {
//        char[] chs = s.toCharArray();
//
//        reverse(chs);
//        return new String(chs);
        return "";
    }

    private static void reverse(char[] arr,int x,int y)
    {
        for(int start=x,end=y-1;start<end;start++,end--)
        {
            swap(arr,start,end);
        }
    }

    private static void swap(char[] arr,int x,int y)
    {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static String myTrim(String str)
    {
        int start = 0,end = str.length()-1;

        while(start<=end && str.charAt(start) == ' ')
            start++;

        while(start<=end && str.charAt(end) == ' ')
            end--;

        return str.substring(start,end+1);
    }
}
