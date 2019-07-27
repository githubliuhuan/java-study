package day13;
/*
4.获取两个字符串中最大相同子串，第一个动作：将短的那个串进行长度依次递减的子串打印。

    思路：
       1.将短的那个子串按照长度递减的方式获取到。
       2.将每获取到的子串去长串中判断是否包含。

 */


public class StringTest3 {
    public static void sop(String str)
    {
        System.out.println(str);
    }

    public static String getMaxSubString(String s1,String s2)
    {
        String max = "",min = "";

        max = (s1.length()>s2.length())?s1: s2;

        min = (max.equals(s1))?s2: s1; // min = (max == s1)?s2: s1;

        for(int x=0;x<s2.length();x++)
        {
            for(int y=0,z=min.length()-x;z!=min.length()+1;y++,z++)
            {
                String temp = min.substring(y,z);
                sop(temp);
                if(max.contains(temp)) // if(s1.indexOf(temp)!=-1)
                    return temp;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s1 = "abcwerthelloyuiodef";
        String s2 = "cvhellobnm";
        sop(getMaxSubString(s1,s2));
    }
}
