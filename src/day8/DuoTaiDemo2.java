package day8;
/*
多态：可以理解为事物存在的多种表现形态。
人：男人、女人
动物：猫、狗
猫 x = new 猫();
动物 x = new 动物();

1.多态的体现
    父类的引用指向自己的子类的对象
    父类的引用也可以接收自己的子类的对象
2.多态的前提
    必须是类与类之间有关系，要么继承，要么实现。
    通常还有一个前提：存在覆盖。
3.多态的好处
    提高程序扩展性、
4.多态的弊端
    提高了扩展性，但是只能使用父类的引用访问父类中的成员。

5.多态的应用

6.多态的出现代码中的特点（多态使用的注意事项）

动物：
猫 狗

 */

abstract class Animal2
{
    public abstract void eat();
}

class Cat2 extends Animal2
{
    public void eat()
    {
        System.out.println("吃鱼");
    }

    public void catchMouse()
    {
        System.out.println("抓老鼠");

    }

}

class Dog2 extends Animal2
{
    public void eat()
    {
        System.out.println("啃骨头");
    }

    public void catchMouse()
    {
        System.out.println("看家");

    }

}

class Pig2 extends Animal2
{
    public void eat()
    {
        System.out.println("饲料");
    }

    public void gongDi()
    {
        System.out.println("拱地");

    }

}

public class DuoTaiDemo2 {
    public static void main(String[] args) {
        Animal2 a = new Cat2(); // 类型提升,向上转型 byte b = 2; int x = b;
        a.eat();
        // 如果想要调用猫的特有方法时，该怎么办？
        // 强制将父类的引用，转成子类类型。向下转型
        Cat2 c = (Cat2)a;
        c.catchMouse();

        // Animal2 aa = new Animal2(); Cat2 cc = (Cat2)aa; 不予许
        // 千万不用出现这种操作，就是将父类对象转成子类类型。
        // 我们能转换的是父类应用指向了自己的子类对象时，该应用可以被提升，也可以强制转换。
        // 多态自始至终都是子类对象在做着变化。
    }
    public static void function(Animal2 a)
    {
        a.eat();
        // if(a instanceof Cat)
        // {Cat2 c = (Cat2)a;}
        // else if(a instanceof Dog) {}
        // c.catchMouse();
    }

}

