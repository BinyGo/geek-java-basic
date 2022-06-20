package basic;

public class ForOperators {
    public static void main(String[] args){
        //for(初始语句;循环体条件表达式;循环体后语句){
        // for循环体
        // }
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        // for 循环打印a-z
        char ch = 'a';
        int startNum = ch;
        for (int i=0; i < 26; i++){
            int newNum = startNum + i;
            if (i>10){
                continue; // 进入下一次循环
            }
            System.out.println(newNum + "\t" + ((char) newNum));
            if (i>20){
                break; // 退出循环整个循环
            }
        }

        // for 写法2
        int[] apples = new int[5];
        for (int a:apples){
            System.out.println(a);
        }
    }
}
