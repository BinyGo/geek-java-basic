public class MathCalc {
    public static void main(String[] args){ //一堆大括号括起来就是一个代码块
        System.out.println("5+6");
        System.out.println(5+6); //11
        System.out.println(5-6); //-1
        System.out.println(5*6); //30
        System.out.println(5/6); //0
        System.out.println(5/6.0); //0.8333333333333334

        System.out.println(1+2-3*4/5.0); //0.6000000000000001
        System.out.println((1+2-3)*4/5.0); //-0.0

        System.out.println((1+2-3)*4/5.0); //-0.0

        //int -2^31~2^31 -2147483648 ~ 2147483647
        int a = 3;
        int b = 5;
        int c = 7;

        int x = 2;
        int y = a*x + b*x*x + c*x*x*x; //整个语句(statement) 等于号后半部分为:表达式(expression)
        System.out.println(y); //82

        int tt;
        tt = 99;
        int uu = 99;

        //生成0到1之间的随机数
        double randNum = Math.random();
        System.out.println(randNum);
    }
}
