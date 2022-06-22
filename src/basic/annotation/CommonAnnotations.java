package basic.annotation;

public class CommonAnnotations implements TestIntf  {

    public static void main(String[] args){
        testOld();//还是可以被执行到,只是在编译器标注了废弃,并会调用Deprecated类
    }
    // TODO 最常见的两个注解可能就是Override和Deprecated
    public void init(){
        test();
    }
    @Override //覆盖父类
    public void test() {

    }

    @Deprecated //废弃的
    public static void testOld() {
        System.out.println("testOld() Deprecated?");
    }
}
