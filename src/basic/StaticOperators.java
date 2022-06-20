package basic;

import static basic.StaticClass.DISCOUNT_FOR_VIP; //TODO 使用import static来引入一个静态变量,即可直接使用静态变量名访问
import static basic.StaticClass.*; // TODO 使用*引入类中所有静态变量,方法
public class StaticOperators {
    public static void main(String[] args){
        // TODO 静态变量在整个java程序中只有一个(多个实例,共用一份静态变量)
        // TODO 静态变量一旦发送变化,有所使用这个静态变量的地方的值都会改变
        System.out.println(StaticClass.DISCOUNT_FOR_VIP);
        StaticClass.DISCOUNT_FOR_VIP = 0.5;
        System.out.println(DISCOUNT_FOR_VIP); // TODO import
        System.out.println(getDiscountForVip()); // TODO import Method
    }
}
