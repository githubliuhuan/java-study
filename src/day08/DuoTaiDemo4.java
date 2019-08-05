package day08;

class Fu
{
    int num = 5;
    void method1()
    {
        System.out.println("fu method_1");
    }
    void method2()
    {
        System.out.println("fu method_2");
    }
    static void method4()
    {
        System.out.println("fu method_4");
    }
}

class Zi extends Fu
{
    int num = 8;
    void method1()
    {
        System.out.println("zi method_1");
    }
    void method3()
    {
        System.out.println("zi method_3");
    }
    static void method4()
    {
        System.out.println("zi method_4");
    }
}



public class DuoTaiDemo4 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method1();
        zi.method2();
        zi.method3();
        System.out.println(zi.num);


        Fu fu = new Zi();
        fu.method1();
        fu.method2();
        System.out.println(fu.num);
        fu.method4(); // 静态方法有重写的特性

//        fu.method3(); 编译失败，父类中没有method3
 /*
 在多态中成员函数（非静态）的特点：
 在编译时期：参阅引用型变量所属的类中是否有调用的方法。如果有，编译通过，如果没有编译失败。
 在运行时期：参阅对象所属的类中是否有调用的方法。

 简单总结就是：成员函数在多态调用时，编译看左边，运行看右边。

在多态中，成员变量的特点：
无论编译和运行，都参考左边（引用型变量所属的类）。

在多态中，静态成员函数的特点：（静态方法本身不访问对象特有数据）
无论编译和运行，都参考左边

静态绑定和动态绑定 引用型变量所属的类.method4 this.method4
  */
    }
}
