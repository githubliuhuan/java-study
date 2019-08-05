package day08;

/*
object：是所有对象的直接或者间接父类，传说中的上帝。
该类中定义的肯定是所有对象都具备的功能。

object类中已经提供了对对象是否相同的比较方法。

如果自定义类中也有比较相同的功能，没有必要重新定义。
只要沿袭父类中的功能，建立自己特有比较内容即可。这就是覆盖。
 */

class Demo
{
//    Demo()
//    {
//        super();
//    }
    private int num;
    Demo(int num)
    {
        this.num = num;
    }
//    public boolean compare(Demo d)
//    {
//        return this.num == d.num;
//    }
    public boolean equals(Object obj) //object obj = new Demo()
    {   if(!(obj instanceof Demo))
            return false;
        Demo d = (Demo)obj;
        return this.num == d.num;
    }

    public String toString()
    {
        return "demo:"+num;
    }

}

class Person
{

        }


public class ObjectDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo(4);
        Demo d2 = new Demo(6);
//        Demo d3 = d1;
//        System.out.println(d1.equals(d2)); // false
//        System.out.println(d1.equals(d3)); // equal比较的是地址
//        System.out.println(d1==d2);
//        System.out.println(d1==d3);

          Person p1 = new Person();
//        Person p2 = new Person();
//        System.out.println(p1.equals(p2));

        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(p1));
        System.out.println(d1.toString());
        System.out.println(Integer.toHexString(d1.hashCode())); // 十六进制转换形式
        Class c = d1.getClass();
        System.out.println(c.getName());

    }
}
