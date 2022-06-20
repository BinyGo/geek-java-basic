package basic;

public class SwitchOperators {
    public static void main(String[] args){
        int n = 5;
        String str = n + "对应的中文数值是:";
        // switch如果未遇到break,会一直执行下去.

        switch (n){
            case 1:
                str += "一";
                break;
            case 2:
                str += "二";
                break;
            case 3:
                str += "三";
                break;
            case 4:
                str += "四";
                break;
            case 5:
                str += "五";
                break;
            case 6:
                str += "六";
                break;
            default: //default子句是可选的,所有的case都没有匹配上,才会执行default中的代码
                System.out.println(n + "未匹配到对应中文");
        }
        System.out.println(str);
    }
}
