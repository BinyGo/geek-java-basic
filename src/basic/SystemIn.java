package basic;

import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args){
        long start = System.currentTimeMillis();//毫秒
        Scanner in = new Scanner(System.in);

        System.out.println("请问你的名字是?");

        String str = in.nextLine();

        System.out.println(str + ",你好.请问你几岁了?");

        int age = in.nextInt();

        System.out.println("好的," + str + age + "岁了.");

        long endNs = System.nanoTime();//纳秒
        long end = System.currentTimeMillis();//毫秒
        System.out.println("执行了"+(end-start)+"毫秒");


    }
}
