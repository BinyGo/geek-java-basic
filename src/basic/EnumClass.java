package basic;

//public class EnumClass {
// TODO 使用enum而非class声明,不能继承
public enum EnumClass {

    // TODO 必须在开始的时候以这种形式,创建所有枚举对象
    FOOD(1),
    COOK(3),
    SNACK(5);

    private  int id; // 可以有属性

    // TODO 构造方法必须是private的,不写也是private
    private EnumClass(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "EnumClass{" +
                "id=" + id +
                '}';
    }
}
