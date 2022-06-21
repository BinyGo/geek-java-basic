package basic;

import java.util.Date;

// TODO 抽象类用abstract修饰,可以继承别的类或抽象类,也可以实现接口
// TODO 抽象类可以有抽象方法,抽象方法可以来自接口,也可自定义
// TODO 抽象类不能被实例化
// TODO 简单说,抽象类就2个特殊: 1) 被abstract修饰,可以有抽象方法 2)不可以被实例化
public abstract class AbstractOperators implements InterfaceClass {
    // TODO 可实现接口方法,但不必完成所有接口方法
    @Override
    public boolean notExpireInDays(int days) {
        System.out.println("自定义逻辑");
        return false;
    }

    // TODO 构造方法和普通类一样
    public AbstractOperators(){

    }

    // TODO 和普通类一样定义方法
    private String GetUserName(){
        this.notExpireInDays2(1); //调用接口类中的default缺省方法
        return "小明";
    }



}
