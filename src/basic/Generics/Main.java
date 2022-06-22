package basic.Generics;




import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO 泛型的作用: 1) 告诉编译器帮我们检查类型是否匹配  2) 在使用的地方悄悄帮我们做强制类型转换
        printListGenerics((List<String>) addElementsToCollection(new ArrayList<>()));
    }


    public static Collection addElementsToCollection(Collection collection) {
        for (int i = 0; i < 10; i++) {
            collection.add("str" + (i % 5));
        }
        return collection;
    }

    public static void printList(List list) {
        System.out.println("---------------------");
        System.out.println("输出list " + list.getClass() + "中的元素，共" + list.size() + "个");
        for (int i = 0; i < list.size(); i++) {
            // TODO 必须强制类型转换,心好累,明明知道里面是String类型
            String str =(String) list.get(i);
            System.out.println(str);
            // System.out.println(list.get(i));
        }
    }

    public static void printListGenerics(List<String> list) {
        System.out.println("---------------------");
        System.out.println("输出list " + list.getClass() + "中的元素，共" + list.size() + "个");
        for (int i = 0; i < list.size(); i++) {
            // TODO List<String> 泛型,值只能是String,所以不需要转换
            String str = list.get(i);
            System.out.println("<String>"+str.toUpperCase());
            // System.out.println(list.get(i));
        }
    }

}