package basic;

public class StaticClass {

    // TODO 静态变量使用 static 修饰符,如未赋初值,会自动复议类型零值
    // TODO 静态变量一般全大写加下划线分割
    public static double DISCOUNT_FOR_VIP = 0.95;
    // TODO 未加public修饰,表示仅包内代码可用
    static double DISCOUNT_FOR_INTERNAL = 0.95;
    public  int count =100;
    // 静态代码块
    static {
        DISCOUNT_FOR_VIP=0.8;
        DISCOUNT_FOR_INTERNAL = 0.7;
    }

    // TODO 静态方法可以访问静态变量,包括自己与访问控制符允许的别的类中的静态变量
    // TODO 无法使用this,无法访问保内变量,方法; 它不属于某个实例,无须new初始化实例,通过包名-类名-静态方法直接调用
    // TODO 可在静态方法中创建对象,或通过参数,获得对象的引用,进而调用对象的方法与成员变量
    public static double getDiscountForVip(){
        return DISCOUNT_FOR_VIP;
    }

    // TODO 静态方法同样可以重载
    public static double getDiscountForVip(int count){
        return count>0 ? count*DISCOUNT_FOR_VIP : DISCOUNT_FOR_INTERNAL;
    }

    public static double getDiscountForVip(double count){
        return count>0 ? count*DISCOUNT_FOR_VIP : DISCOUNT_FOR_INTERNAL;
    }

    public static int getDiscountForVip(int count,int count2){
        return count+count2;
    }
}
