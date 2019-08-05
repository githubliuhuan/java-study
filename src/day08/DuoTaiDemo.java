package day08;
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



动物：
猫 狗

 */

abstract class Animal
{
    public abstract void eat();
}

class Cat extends Animal
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

class Dog extends Animal
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

class Pig extends Animal
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

public class DuoTaiDemo {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.eat();
        function(new Cat());
        function(new Dog());
        function(new Pig());

        /*Dog d = new Dog();
        d.eat();

         */
    }
    public static void function(Animal a)
    {
        a.eat();
    }

}

