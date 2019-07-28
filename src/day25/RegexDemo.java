package day25;
/*
正则表达式
 */



public class RegexDemo {
    public static void main(String[] args) {
        String qq = "1234567";
        checkQQ(qq);

        String regex = "[1-9][0-9]{4,14}";
        boolean b = qq.matches(regex);

        System.out.println(qq+":"+b);
    }

    public static void checkQQ(String qq)
    {
        int len = qq.length();
        if(len>=5 && len<=15){
            if(!qq.startsWith("0")){
                try {
                    long l = Long.parseLong(qq);
                    System.out.println(l+":正确");
                }
                catch(NumberFormatException e){
                    System.out.println(qq+":含有非法字符");
                }
            }
            else{System.out.println(qq+":不能0开头");};
        }
        else{
            System.out.println(qq+"：长度错误");
        }
    }
}
