package basic;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassOperators {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        GoodsClass apple = new GoodsClass();
        //Class clazz = apple.getClass();
        Class clazz = GoodsClass.class;
        Field sexField = clazz.getField("sex");
        Field nameField = clazz.getDeclaredField("name"); //获取非public的变量
        nameField.setAccessible(true);//改变为可变更
        System.out.println(sexField.getName());
        sexField.set(apple,"女");
        System.out.println(sexField.get(apple)); // TODO reflect反射获取apple类的sex值

        // TODO reflect 循环输出所有filed
        printFields(clazz);


        Method quealsMethod = clazz.getMethod("equals", Object.class); //getDeclaredMethod
        Method describeMethod = clazz.getMethod("describe", String.class);
        System.out.println(describeMethod.getName());
        System.out.println(describeMethod.invoke(apple,"小黑"));

        Method describePrintMethod = clazz.getMethod("describePrint");
        System.out.println(describePrintMethod.getName());
        System.out.println(describePrintMethod.invoke(apple));

    }

    public static void printFields(Class clazz){
        System.out.println("打印"+clazz.getName()+"里的field");
        for (Field field:clazz.getFields()){
            System.out.println("for getFields:"+field.getType()+" "+field.getName());
        }
    }
}
