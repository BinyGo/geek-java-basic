package basic;

import java.util.Scanner;

public class EnumOperators {
    public static void main(String[] args){
        for(EnumClass e:EnumClass.values()){
            System.out.println("------------"+e.getId()+"-----------");
            System.out.println(e.ordinal());
            System.out.println(e.name());
            System.out.println(e.toString());
        }

        System.out.println();
        // TODO 根据名字获取枚举
        EnumClass.FOOD.getId();
        System.out.println(EnumClass.valueOf("FOOD"));
        System.out.println(EnumClass.valueOf("COOK"));

        Scanner in = new Scanner(System.in);
        System.out.println("请输入枚举的名字:");
        String name = in.next();
        EnumClass enumInput = EnumClass.valueOf(name.trim().toUpperCase());
        System.out.println("枚举的信息:"+enumInput.toString());

        System.out.println("请输入第二次枚举的名字:");
        String name2 = in.next();
        EnumClass enumInput2 = EnumClass.valueOf(name2.trim().toUpperCase());
        System.out.println("第二次枚举的信息:"+enumInput2.toString());

        System.out.println(enumInput==enumInput2);
        System.out.println(enumInput.equals(enumInput2));
    }
}
