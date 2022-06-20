public class BitwiseOperators {
    public static void main(String[] args){
        // 以0开头的整数为八进制
        int a = 05;
        System.out.println(a); // 05等于十进制的5
        System.out.println(011); // 011等于十进制的9

        // 以0x开头的整数为十六进制
        int b = 0xF;
        System.out.println(b); // 0xF等于十进制的15
        System.out.println(0x11); // 0x11等于十进制的17

        // 按位运算符 (按二进制一位一位的进行运算)
        // 按位并(AND):&
        // 按位或(OR):|
        // 按位异或(XOR):^
        // 按位取反:~
        int aa = 0xF8; // 248 二进制 1111 1000
        int bb = 0xF4; // 244 二进制 1111 0100
        int cc = 0xFF; // 255 二进制 1111 1111
        System.out.println(aa & bb); // 240 二进制 1111 0000
        System.out.println(aa | bb); // 252 二进制 1111 1100
        System.out.println(aa ^ bb); // 12
        System.out.println(~cc); // -256

        //位移运算符
        // >>:符号不动,其余位右移,符号位后面正数补0.负数补1.又称带符号右移
        // >>>:符号位一起右移,左边补0.又称无符号右移
        // <<:左移,右边补0.左移没有带符号这一说,因为符号位在最左侧
        System.out.println(aa >> 1); // 右移一位
        System.out.println(aa >> 2); // 右移两位

    }
}
