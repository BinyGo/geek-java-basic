package basic;

// TODO 使用extends继承,下例中:GoodsClass为父类,GoodsExtends为子类
// TODO java中允许一个类有一个父类
// TODO 如还存在一个类apple extends GoodsExtends,apple即是GoodsExtends的子类
// TODO 子类继承父类所有属性和方法,但是子类不能访问父类的private成员(包括属性和方法)
public class GoodsExtends extends GoodsClass {
    // TODO 使用super调用父类构造方法,必须是子类构造方法的第一个语句
    // TODO 可以使用表达式,super调用构造方法,不可使用super访问父类的属性和方法,不可以使用子类的成员变量和方法
    // TODO 可以使用静态变量和方法
    public GoodsExtends(String name3){
        //super(name3); //使用传入的变量
        super();
    }
    //给GoodsExtends增加新属性方法
    private String brand;
    public int sex;  // TODO 覆盖父类属性:public String sex;

    public String getBrand() {
        describePrint(); // TODO 调用父类方法
        super.describePrint(); // TODO 调用父类方法
        super.describe(brand); // TODO 调用被覆盖的父类方法
        return brand+sex;
    }

    // TODO 覆盖(override)父类方法,必须方法名参数与父类一致,返回值也必须一致
    public String describe(String userName){
        userName = "??";
        return userName + "覆盖父类:购买商品:" + name + " 价格:"+ price + " 库存:"+ count;
    }
}
