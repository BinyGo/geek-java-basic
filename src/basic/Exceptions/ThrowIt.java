package basic.Exceptions;

public class ThrowIt {

    // >> TODO 可以使用throws关键字，抛出一个异常。
    // >> TODO 抛出的异常类型，可以是实际异常的父类或者本身。
    // >> TODO 可以抛出多种类型的异常，用逗号分开就可以。
    // public static void main(String[] args) throws Exception { 可选择抛出父类 Exception
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = Class.forName("abc");
        clazz.getField("");
    }

    public static void useCauseException() throws Exception {
        causeException();
        causeRuntimeException();
    }

    public static void causeException() throws Exception {
        // >> TODO 可以创建一个checked exception，然后用throw关键字扔出去
        // >> TODO 这时候就需要方法也要有throws语句，同样的，throws语句的类型要能覆盖实际异常的类型
        throw new Exception("");
    }

    public static void causeRuntimeException() throws RuntimeException {
        // >> TODO 可以创建一个unchecked exception，然后用throw关键字扔出去
        // >> TODO 这时候，方法可以有，也可以没有throws语句
        throw new RuntimeException("");
    }

}
