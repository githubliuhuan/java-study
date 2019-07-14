public class StringTest {
    public static void main(String[] args) {
        /**
         * 情景一：字符串池
         * JAVA虚拟机(JVM)中存在着一个字符串池，其中保存着很多String对象;
         * 并且可以被共享使用，因此它提高了效率。
         * 由于String类是final的，它的值一经创建就不可改变。
         * 字符串池由String类维护，我们可以调用intern()方法来访问字符串池。
         */

        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 : "+(s1==s2));
    }
}
