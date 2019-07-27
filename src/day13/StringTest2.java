package day13;
/*
3.获取一个字符串在另一个字符串中出现的次数
    "abkkcdkkefkk"
    思路
    1.定义个计数器
    2.获取kk第一次出现的位置
    3.从第一次出现位置后剩余的字符串字符串中继续获取kk出现的位置
      每获取一次计数一次
    4.当获取不到时，计数完成
 */



public class StringTest2 {
    public static void sop(String str)
    {
        System.out.println(str);
    }

    public static int getSubCount(String str,String key)
    {
        int count = 0,index = 0;
        while ((index=str.indexOf(key))!=-1)
        {
            sop("str="+str);
            str = str.substring(index+key.length());
            count++;
        }
        return count;
    }

    public static int getSubCount_2(String str,String key)
    {
        int count = 0,index = 0;
        while ((index=str.indexOf(key,index))!=-1)
        {
            sop("index="+index);
            index = index + key.length();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "kkabkkcdkkefkk";
        sop("count="+getSubCount(str,"kk"));
        sop("count="+getSubCount_2(str,"kk"));
        // sop("count====="+str.split("kk").length); 不建议使用。
    }
}
