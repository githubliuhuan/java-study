public class PersonDemo {
    // Person p = new Person("zhangsan",20)
    /*该句话做了哪些事情？
    1.因为new用到了Person.class，所以会先找到Person.class文件并加载到内存中
    2.执行该类中的static代码块，如果有的话，给Person.class类进行初始化。
    3.在堆内存中开辟空间，分配内存地址
    4.在堆内存中建立对象的特有属性，并进行默认初始化
    5.对属性进行显示初始化
    6.对对象进行构造代码块初始化
    7.对对象进行对应的构造函数初始化
    8.将内存地址赋值给内存中的p变量
     */
}