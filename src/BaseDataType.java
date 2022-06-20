public class BaseDataType {
    public static void main(String[] args){
        System.out.println("base data type");
        // 十进制 每一位可以是0~9这10个值,到10进位.一百用十进制表示就是100,十就是10
        // 二进制 每一位可以是0和1这两个值,到2进位.一百用二进制表示就是1100100,十就是1010
        // 十六进制 每一位可以是0~F这15个值,到16进位.一百用十六进制表示就是64,十就是A

        // 一个二进制的位叫做一个bit,俗称小b.带宽中的单位,都是小b
        // 八个二进制的位,组成一个byte,俗称大B.硬盘等存储的单位,都是大B
        // Byte是计算机中基本的衡量存储的单位,计算机在对外使用时不会用小b作为划分存储单位.

        //整数类型
        // byte 占用1个byte,值域是-128~127
        // short 占用2个byte,值域是-32768~32767
        // int 占用4个byte,值域是-2147483648~2147483647
        // long 占用8个byte,值域是-9223372036854774808~9223372036854774807
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854774807L;


        //浮点(小数)类型
        // float 占用4个byte,有精度,值域复杂+-340282346638528859811704183484516925440
        // double 精度是float的两倍,占用8个字节.java中浮点数缺省是double类型
        float floatVar = 100.1111111f;
        System.out.println(floatVar); //100.1111115 精度丢失
        double doubleVar = 100.1111111;
        System.out.println(doubleVar); //100.1111111

        // 符号位 正负符号,占用1个bit

        //布尔和字符数据类型
        // boolean 占用1个byte,值域是true,false
        boolean bTrue = true;
        boolean bFalse = false;
        System.out.println(1<2); //true
        System.out.println(1>2); //false
        // char 占用2个byte,值域是所有字符
        char charVar = '好';
        System.out.println(charVar);
        System.out.println('A'); //字符,单引号括起来,仅能一个
        System.out.println("ABC"); //字符串

        //自动类型转换
        //数值精度顺序 double>float>long>int>short/byte
        //char可转换为int,char是无符号数,值域超出了short可表示的范围,所以不可以自动转换为short
        int intVal = 99;
        long longVal = intVal;
        long longVal2 = intVal+1;

        float floatVal = 11.32f;
        double doubleVal = floatVal;
        double doubleVal2 = floatVal * 2;
        System.out.println(doubleVal2); //22.639999389648438

        char ch = '国';
        int chNum = ch;
        int chNumCalc = ch+10;
        System.out.println(ch); //国
        System.out.println(chNum); //22269
        System.out.println(chNumCalc); //22279

        //强制性转换 潜在数据精度丢失
        char ch2 = (char) ((int)ch+10);
        System.out.println(ch2); //圇
        intVal = (int) doubleVal;
        char ch3 = (char) intVal;

    }
}
