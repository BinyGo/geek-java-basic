package basic;

// TODO final 修饰符表示不能被继承
public final class finalClass {
    // TODO 用 final 修饰静态变量,仅能被赋值一次
    // private final int GOODS_ORDER = 5;
    private final int GOODS_ORDER;


    // TODO 构造方法不能用 final 修饰
    public finalClass(){
        this.GOODS_ORDER=6;
    }

    /*
    public static void setGoodsOrder(int xxxOrder) {
        GOODS_ORDER = xxxOrder;
    }
    */

    public int getGoodsOrder() {
        return GOODS_ORDER;
    }

}
