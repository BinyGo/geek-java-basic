package basic;

/**
 *
 * 这个类的说明,可以被翻译成文档
 * @author biny
 *
 */
public class GoodsOperators {
    public static void main(String[] args){
        // TODO 使用new操作符,创建一个类的实例/对象(instance/object)
        // TODO 使用new创建实例后,类中定义的每个变量都可以被赋以其类型的初始值
        // TODO 这个和数组是一样的
        // TODO  使用一个同类型的对象变量,可以指向并操作这个实例.
        GoodsClass apple = new GoodsClass();
        apple.name = "大苹果";
        apple.id = "00022222";
        apple.count = 1000;
        apple.price = 88.8;

        GoodsClass pear; //变量声明
        pear = new GoodsClass();
        pear.name = "梨";
        pear.id = "00011111";
        pear.count = 2000;

        apple.count -=1;
        System.out.println(apple.count); //999
        System.out.println(apple); //basic.GoodsClass@4eec7777
        System.out.println(pear); //basic.GoodsClass@3b07d329
        System.out.println(pear.price); //0.0 未赋值时默认类型零值

        pear.describePrint();
        String diyName = "小白";
        String aa = pear.describe(diyName); // TODO 普通变量,函数内部改变变量,外部不受影响
        System.out.println(aa); //??购买商品:梨 价格:0.0 库存:2000
        System.out.println(diyName); //小白

        System.out.println(pear.price); // TODO 引用传入 对象,函数内部改变变量,外部受影响
        apple.copyPrice(pear);
        System.out.println(pear.price);
        apple.duplicateName(apple.count); // TODO duplicateName方法的参数为double,这里可传入int类型

        GoodsClass[] banana = new GoodsClass[3];
        for (int i=0;i<banana.length;i++){
            if (i % 2 ==0)
                banana[i] = new GoodsClass();
        }
        // TODO 未赋值使用 NullPointerException null报错
        //System.out.println(banana[1].price); //Exception in thread "main" java.lang.NullPointerException: Cannot read field "price" because "banana[1]" is null

        // TODO 改变初始化类的方式
        GoodsClass apple2 = new GoodsClass();
        apple2.init("苹果2","009",120,66.6);

        GoodsExtends apple3 = new GoodsExtends("333");
        // TODO instanceof 操作符判断一个引用指向的对象是否是某一个类型或者其子类,是返回true,否则返回false
        if (apple3 instanceof GoodsClass){
            // TODO 先判断,再强制类型转换
            GoodsClass apple4 = (GoodsClass)apple3;
            System.out.println(apple4.getClass());
            System.out.println(apple4.describe("apple4"));
        }else{
            System.out.println("instanceof false");
        }
    }
}
