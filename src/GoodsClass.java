// TODO 高亮注释
// >> TODO 一个类以public class开头,public class 代表这个类是公共类,类名必须和文件名相同
// >> TODO public class后面紧跟类名,然后是一对大括号的类体
/**
 *
 * 这个类的说明,可以被翻译成文档
 * @author biny
 *
 */
public class GoodsClass {
    // TODO 类体中可以定义描述这个类的属性的变量.我们称之为变量(member variable)
    // TODO 每个成员变量的定义以;结束
    String name;
    String id;
    int count;
    double price;

    // TODO 返回值:无需返回值用void表示
    public void describePrint(){
        System.out.println("商品:" + name + " 价格:"+ price + " 库存:"+ count);
    }

    // TODO 一个方法只能有一种返回值,如不需要返回值用void表示
    // TODO 使用 return语句返回方法返回值

    /**
     * 传入用户名,输出产品购买信息
     * @param userName
     * @return
     */
    public String describe(String userName){
        userName = "??";
        return userName + "购买商品:" + name + " 价格:"+ price + " 库存:"+ count;
    }

    /**
     *
     * @param g
     */
    public void copyPrice(GoodsClass g){
        g.price = price;
    }

    public void duplicateName(double count){
        this.count = 999; //TODO 对象内的全局变量count,使用this自引用,可访问这个对象的方法、值。不存在同名局部变量时可省略this写法
        count = 888; //传入的参数变量count
    }

    // TODO 改变初始化类的方式
    public void init(String name, String id, int count, double price){
        this.name = name;
        this.id = id;
        this.count = count;
        this.price = price;
    }
}