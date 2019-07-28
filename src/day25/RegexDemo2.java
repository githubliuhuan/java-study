package day25;
/*
 正则表达式对字符串的常见操作：
 1.匹配
    其实使用的就是String类中的matches方法。
 2.切割
    split方法
 3.替换
    replaceAll()方法

 4.获取
    将正则规则进行对象的封装。
    Pattern p = Pattern.compile(a*b);
    通过正则对象的matcher方法和字符串相关联。获取要对字符串操作的匹配器对象Matcher
    Matcher m = p.matcher("aaaaab");
    通过Matcher匹配器对象的方法对字符串进行操作。
    boolean b = m.matches();
 */


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        functionDemo_1();
        functionDemo_2();
    }

    public static void functionDemo_1() {
        // 匹配手机号码是否正确
        String tel = "15800001111";
        String regex = "1[358]//d{9}"; // "1[358][0-9]{9}";
        boolean b = tel.matches(regex);
        System.out.println(tel + ":" + b);
    }

    public static void functionDemo_2() {
        String str = "zhangsan      xiaoqiang  zhaoliu";
        // String str = "zhangsanttttttttxiaoqiangmmmmzhaoliu";
        // String[] names = str.split("(.)\\1+");
        String[] names = str.split(" +"); // str.split("\\.");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void functionDemo_3() {
        String str = "";
        str = str.replaceAll("(.)\\1+", "$1");// str = str.replaceAll("(.)\\1+","#");
        System.out.println(str);

        String tel = "15800001111";
        tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        System.out.println(tel);
    }

    public static void functionDemo_4() {
        String str = "da jia hao,ming tian bu fang jia!";
        String regex = "[a-z]{3}";

        // 1.将正则封装成对象。
        Pattern p = Pattern.compile(regex);
        // 2.通过正则对象获取匹配器对象。
        Matcher m = p.matcher(str);

        // 使用Matcher对象的方法对字符串进行操作
        // 既然要获取三个字母组成的单词
        // 查找。 find();
        System.out.println(str);
        while (m.find()) {
            System.out.println(m.group()); // 获取匹配的子序列
            System.out.println(m.start() + ":" + m.end());
        }
    }
}
