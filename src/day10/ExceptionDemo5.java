package day10;

class FuShuException extends Exception {
    FuShuException(String msg) {
        super(msg);
    }
}

class Demo {
    int div(int a, int b) throws FuShuException {
        if (b<0)
            throw new FuShuException("除数为负数");
        return a/b;
    }
}

public class ExceptionDemo5 {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            int x = d.div(4, -1);
            System.out.println("x="+x);
        }
        catch (FuShuException e) {
            System.out.println(e.toString());
            return;
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("over");
    }
}
