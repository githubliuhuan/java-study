class Student {
    private int age;
    private static Student s = new Student();
    private Student(){}
    public static Student getStudent()
    {
        return s;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }
}

public class SingleDemo {


    public static void main(String[] args) {
        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();

    }
}
