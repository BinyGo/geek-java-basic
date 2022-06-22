package basic.Exceptions;

public class MustHandel {
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO checked exception,必须用try catch捕获
        try {
            Class clazz = Class.forName("basic.Exceptions.MustHandle");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}