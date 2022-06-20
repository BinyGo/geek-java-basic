public class OverLoad {
    public int count;
    public double soldPrice;


    // >> TODO 方法重载写法示例,返回值必须一直,根据传入参数不同区分不同方法重载
    public double buy() {
        return buy(1);
    }

    // TODO 参数重载匹配规则
    // TODO 参数自动转换匹配,依次byte,short,int,long,float,double,如传入byte参数,没有byte的重载类,自动依次找到int
    public double buy(int count) { return buy(count, false);
    }

    // TODO  最后都补充好参数，调用参数最全的一个方法
    public double buy(int count, boolean isVIP) {
        if (this.count < count) {
            return -1;
        }
        this.count -= count;
        double totalCost = count * soldPrice;
        if (isVIP) {
            return totalCost * 0.95;
        } else {
            return totalCost;
        }
    }
}
