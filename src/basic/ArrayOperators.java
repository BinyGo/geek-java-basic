package basic;

public class ArrayOperators {
    public static void main(String[] args){
        // 创建数组
        // 数组元素类型[] 变量名 = new 数组元素类型[数组长度], 数组创建后长度不可变, 越界会引发异常报错,
        // 变量名[索引] 可以使用这个变量,可以读取也可以赋值
        int[] intArray = new int[8];
        System.out.println(intArray[2]); //0
        System.out.println(intArray.length); //数组长度

        String[] strArray = new String[9];
        System.out.println(strArray[3]); //null
        //System.out.println(strArray[30]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 9

        double[] doubleArray = new double[100];
        System.out.println(doubleArray[66]); //0.0


        // 声明六个变量， 分别代表六门科目的成绩
        int YuWenIndex = 0;
        int ShuXueIndex = 1;
        int WaiYuIndex = 2;
        int WuLiIndex = 3;
        int HuaXueIndex = 4;
        int ShengWuIndex = 5;

        // 每门课的名字
        String[] names = new String[6];
        names[YuWenIndex] = "语文";
        names[ShuXueIndex] = "数学";
        names[WaiYuIndex] = "外语";
        names[WuLiIndex] = "物理";
        names[HuaXueIndex] = "化学";
        names[ShengWuIndex] = "生物";

        // 每门课的成绩
        double[] scores = new double[6];

        // 用随机数给成绩赋值
        for (int i = 0; i < 6; i++) {
            scores[i] = 80 + Math.random() * 20;
        }

        // 计算最高成绩和最高成绩对应的科目的索引
        double maxScore = -1;
        int maxScoreIndex = -1;
        for (int i = 0; i < 6; i++) {
            System.out.println(names[i] + "的成绩为" + scores[i]);
            if (maxScore < scores[i]) {
                maxScore = scores[i];
                maxScoreIndex = i;
            }
        }

        // 输出最高成绩科目和成绩
        System.out.println("最高分的科目为" + names[maxScoreIndex] + "，成绩为：" + maxScore);

        // 二位数组 多维数组
        int[][] intScores = new int[3][6];
        intScores[0] = new int[50];

    }
}
