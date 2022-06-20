package basic;

public class Operators {
    public static void main(String[] args){
        int a = 100;
        a = a + 6;

        //取模
        System.out.println(a % 2);
        System.out.println(a % -3);

        int b = 10;
        int c = 3;
        System.out.println(b / c); //3 整数除以整数,结果还是整数类型
        double d = 3.0;
        System.out.println(b / d); //3.3333333333333335

        //比较运算符 > >= < <= != ==

        //布尔运算符
        // ! 非运算,not运算. !true是false,!false是true
        System.out.println(!true); // false
        System.out.println(!false); // true
        // & 且运算,and运算符.
        System.out.println(true & true); // true
        System.out.println(true & false); // false
        System.out.println(false & false); // false
        // | 或运算,or运算符.
        System.out.println(true | true); // true
        System.out.println(true | false); // true
        System.out.println(false | false); // false

        //运算符优先级
        // ()
        // !
        // *,/,%
        // >,>=,<,<=
        // ==
        // !=
        // &,&&,|,||
        // =

        //计算并赋值运算符
        // += -= /= *= %= &= ^= |= <<= >>= >>>=
    }
}
