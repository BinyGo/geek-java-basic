package basic.Collections;

import basic.Collections.mylist.MyArrayList;
import basic.Collections.mylist.MyLinkedList;

import java.util.*;

public class UseListAppMain {

    public static void main(String[] args) {
        printCollection(addElementsToCollection(new ArrayList()));
        printCollection(addElementsToCollection(new LinkedList()));
        printCollection(addElementsToCollection(new HashSet()));

//        printCollection(addElementsToCollection(new MyArrayList()));
//        printCollection(addElementsToCollection(new MyLinkedList()));

        printList((List) addElementsToCollection(new ArrayList()));
        printList((List) addElementsToCollection(new MyArrayList()));
        printList((List) addElementsToCollection(new MyLinkedList()));
        printList((HashSet) addElementsToCollection(new HashSet())); //保证不重复,但是无序乱序的,不是线程安全


        printListGenerics((List<String>) addElementsToCollection(new ArrayList<>()));
    }


    public static Collection addElementsToCollection(Collection collection) {
        for (int i = 0; i < 10; i++) {
            collection.add("str" + (i % 5));
        }
        return collection;
    }

    public static void printCollection(Collection collection) {
        System.out.println();
        System.out.println("输出" + collection.getClass() + "中的元素，共" + collection.size() + "个");
        try {
            for (Object element : collection) {
                System.out.println(element);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void printList(List list) {
        System.out.println();
        System.out.println("输出list " + list.getClass() + "中的元素，共" + list.size() + "个");
        for (int i = 0; i < list.size(); i++) {
            // TODO 必须强制类型转换,心好累,明明知道里面是String类型
            String str =(String) list.get(i);
            System.out.println(str);
            // System.out.println(list.get(i));
        }
//        for (Object row:list) {
//            System.out.println(row);
//        }
    }

    public static void printListGenerics(List<String> list) {
        System.out.println();
        System.out.println("输出list " + list.getClass() + "中的元素，共" + list.size() + "个");
        for (int i = 0; i < list.size(); i++) {
            // TODO List<String> 泛型,值只能是String,所以不需要转换
            String str = list.get(i);
            System.out.println("<String>"+str.toUpperCase());
            // System.out.println(list.get(i));
        }
//        for (Object row:list) {
//            System.out.println(row);
//        }
    }

    public static void printList(HashSet list) {
        System.out.println();
        System.out.println("输出HashSet " + list.getClass() + "中的元素，共" + list.size() + "个");
        for (Object row:list.toArray()) {
            System.out.println(row);
        }
    }


}