package day07;
/*
接口：初期理解，可以认为是一个特殊的抽象类
    当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示。
class：用于定义类
interface：用于定义接口

接口定义时，格式特点：
1.接口中常见定义：常量，抽象方法。
2.接口中的成员都有固定的修饰符。
常量：public static final
方法：public abstract
记住：接口中的成员都是public的。

interface 里面的修饰符都是固定的（不写自动加上）
接口：是不可以创建对象的，因为有抽象方法。
需要被子类实现，子类对接口中的抽象方法全都覆盖后，子类才可以实例化。
否则子类是一个抽象类。

接口可以被类多实现，也是对多继承不支持的转换形式（父类中的方法可能有重复，导致子类调用产生问题）。java支持多实现。
接口可以实现多继承，因为没有方法体

接口的特点：
接口是对外暴露的规则。
接口是程序的功能扩展。
接口可以用来多实现。
类与接口之间是实现关系，而且类可以继承一个类的同时实现多个接口。
接口与接口之间可以有继承关系。






 */

interface Inter
{   public static final int NUM = 3;
    public abstract void show();
}

interface InterA
{
    public abstract void method();
    public abstract void show();

}

class Demoo
{
    void function(){};
}

class Test extends Demoo implements Inter,InterA
{
    public void show(){};
    public void method(){};
    public void function(){};

}

interface A
{
    void methodA();
}

interface B extends A
{
    void methodB();
}


interface C extends B
{
    void methodC();
}

class D implements C
{
    public void methodA(){};
    public void methodB(){};
    public void methodC(){};

}

public class InterfaceDemo {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.NUM);
        System.out.println(Test.NUM);
        System.out.println(Inter.NUM);

        // t.NUM = 4;

    }
}
