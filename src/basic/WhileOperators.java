package basic;

public class WhileOperators {
    public static void main(String[] args){
        // while(条件表达式){
        // while 循环体
        // }
        int n = 10;

        int dividend = 100;
        int divisor = 89;

        int found = 0;

        while (found<n){
            if (dividend%divisor==0){
                found++;
                System.out.println(dividend + "可以整除" + divisor + ",商为:" + (dividend%divisor));
            }
            if (dividend>500){
                System.out.println("除数大于500,提前结束");
                break;
            }
            dividend++;
        }

        // do-while语句的循环体至少执行一次
        // do{
        // while循环体
        // } while(循环体表达式);
        do{
            System.out.println("do-while 至少执行一次");
        } while (false);
    }
}
