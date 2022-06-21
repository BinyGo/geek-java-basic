package basic;

import java.util.Date;

// TODO 接口的定义使用interface,而非class,接口可继承接口
// TODO 接口中的方法,就是这个类的规范,接口专注于规范,而不是实现,如需缺省的实现方法，用default修饰，可以有方法体
// TODO 接口无法被实例化,也就是不可以new一个接口实例
// TODO 接口不能声明实例变量
public interface InterfaceClass {

    // TODO 接口里的方法都是public abstract修饰的,方法有名字,参数和返回值,没有方法体
    // TODO 接口需写注释
    /**
     * 截止到当前，商品的保质期天数是否超过传递的天数
     *
     * @param days 截止到当前，保质期超过这么多天
     * @return 截止到当前，true如果保质期剩余天数比参数长，false如果保质期不到这多天
     */
    boolean notExpireInDays(int days);

    // >> TODO 缺省的实现方法，用default修饰，可以有方法体
    /**
     * 截止到当前，商品的保质期天数是否超过传递的天数
     *
     * @param days 截止到当前，保质期超过这么多天
     * @return 截止到当前，true如果保质期剩余天数比参数长，false如果保质期不到这多天
     */
    default boolean notExpireInDays2(int days) {
        return daysBeforeExpire() > days;
    }

    // >> TODO 因为接口里的方法都是且只能用public abstract修饰，所以这俩修饰符可以省略
    // >> TODO abstract就是抽象方法的修饰符，没有方法体，以分号结束
    /**
     * @return 商品生产日期
     */
    Date getProducedDate();

    /**
     * @return 商品保质期到期日
     */
    public abstract Date getExpireDate();

    /**
     * @return 截止到当前，剩余保质期还剩下总保质期长度的百分比
     */
    double leftDatePercentage();


    /**
     * 根据剩余的有效期百分比，得出商品现在实际的价值
     * @param leftDatePercentage 剩余有效期百分比
     * @return 剩余的实际价值
     */
    double actualValueNow(double leftDatePercentage);

    // >> TODO 接口里不能定义局部变量，定义的变量默认都是public static final的，这三个修饰符同样可以省略

    public static final int VAL_IN_INTERFACE = 999;

    // >> TODO 接口中可以有私有方法，不需要用default修饰
    // >> TODO 接口里的私有方法，可以认为是代码直接插入到使用的地方
    private long daysBeforeExpire() {
        long expireMS = getExpireDate().getTime();
        long left = expireMS - System.currentTimeMillis();
        if (left < 0) {
            return -1;
        }
        printInfo();
        // 返回值是long，是根据left的类型决定的
        return left / (24 * 3600 * 1000);
    }

    // >> TODO 接口中可以有静态方法,不需要用default修饰.静态方法可以被实现接口的类继承
    public static void printInfo(){
        System.out.println("接口中的静态方法printInfo被调用");
    }
}
