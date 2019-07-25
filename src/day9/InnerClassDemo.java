package day9;
/*
内部类的访问规则：
1.内部类可以直接访问外部类中的成员，包括私有。
    之所以可以直接访问外部类中的成员，是因为内部类持有了一个外部类的引用。格式：外部类名.this
2.外部类要访问内部类，必须建立内部类对象。

 */


class Outer
{
    private int x = 3;

    class Inner // 内部类,可以被private修饰
    {
        int x = 4;
        void function()
        {
            int x = 6;
            System.out.println("inner:"+Outer.this.x);
        }

    }

    void method()
    {
        System.out.println(x);
//        OuInner in = new Inner();
//        in.function();
    }

}


public class InnerClassDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.method();
        Outer.Inner in = new Outer().new Inner();
        in.function();
    }
}

