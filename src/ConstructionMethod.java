public class ConstructionMethod {
    String name;
    String id;
    int count;
    double price;

    // TODO 构造方法,与类名一样,没有返回值,可以带参数new GoodsClass(xxx,xxx)时传入参数
    // TODO 如果没有构造方法,java会默认自带一个无参数的构造方法
    // TODO 没有返回值是因为,new class()永远返回创建的对象引用
    public ConstructionMethod(String name,String id){
        //this(name, id,  0, 0); 注意死循环调用
    }

    // TODO 构造方法（constructor）的重载和普通方法一样
    // >> TODO 在构造方法里才能调用重载的构造方法。语法为this(实参列表)
    // >> TODO 构造方法不能自己调用自己，这会是一个死循环
    // >> TODO 在调用重载的构造方法时，不可以使用成员变量。因为用语意上讲，这个对象还没有被初始化完成，处于中间状态。
    // >> TODO 在构造方法里才能调用重载的构造方法时，必须是方法的第一行。后面可以继续有代码
    public ConstructionMethod(String name, String id, int count, double soldPrice) {
        this(name, id); //调用别的重载构造方法
        this.name = name;
    }

    // >> TODO 因为我们添加了构造方法之后，Java就不会再添加无参数的构造方法。如果需要的话，我们可以自己添加这样的构造方法
    public ConstructionMethod() {
    }
}
