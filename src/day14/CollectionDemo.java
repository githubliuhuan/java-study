package day14;
/*
1.add方法的参数类型是Object。以便于接收任意类型对象
2.集合中存储的都是对象的引用（地址）
 */

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        method_2();
    }

    public static void method_get()
    {
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");
        Iterator it = al.iterator();
        while(it.hasNext())
        {
            sop(it.next());
        }

        for(Iterator itt = al.iterator();it.hasNext();)
        {
            sop(itt.next());
        }
    }

    public static void method_2()
    {
        ArrayList al1 = new ArrayList();

        al1.add("java01");
        al1.add("java02");
        al1.add("java03");
        al1.add("java04");
        ArrayList al2 = new ArrayList();

        al2.add("java01");
        al2.add("java02");
        al2.add("java03");
        al2.add("java04");

        // 取交集
        al1.retainAll(al2);
        sop("al1:"+al1);
        sop("al2:"+al2);

        // 干掉相同元素
        al1.removeAll(al2);
    }


    public static void base_method()
        {
            ArrayList al = new ArrayList();

            // 1.添加元素
            al.add("java01");
            al.add("java02");
            al.add("java03");
            al.add("java04");
            // 2.获取个数，集合长度
            sop("size:"+al.size());
            // 3.打印原集合
            sop("原集合："+al);

            // 4.删除元素
            al.remove("java02");

            // 5.判断元素
            sop("java03是否存在："+al.contains("java03"));

            // 6.清空集合
            al.clear();

            // 7.集合是否为空
            sop("集合是否为空："+al.isEmpty());
        }


    public static void sop(Object obj)
    {
        System.out.println(obj);
    }
}
