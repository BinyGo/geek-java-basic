package basic.Exceptions;

public class NotHaveToHandle {
    public static void main(String[] args) throws NullPointerException{
        // TODO Error和RuntimeException是unchecked exception,不要求一定用try catch捕获,不捕获会导致程序报错退出
        String str = null;
        str.toLowerCase();

    }
}