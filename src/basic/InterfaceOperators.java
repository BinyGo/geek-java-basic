package basic;

import java.util.Date;

// TODO 一个类只能继承一个父类,但可以实现多个接口
// TODO 不同接口中定义了一样的方法,也没有问题,要求方法名,参数,返回值是一样的.不然则不是同一样的方法,也就没什么了
public class InterfaceOperators implements InterfaceClass {
    @Override
    public boolean notExpireInDays(int days) {
        return false;
    }

    @Override
    public Date getProducedDate() {
        return null;
    }

    @Override
    public Date getExpireDate() {
        return null;
    }

    @Override
    public double leftDatePercentage() {
        return 0;
    }

    @Override
    public double actualValueNow(double leftDatePercentage) {
        return 0;
    }



}
