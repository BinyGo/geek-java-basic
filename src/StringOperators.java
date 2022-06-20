public class StringOperators {
    public static void main(String[] args){
        //字符集(Charset)
        //字符集就是字符的集合,一般包含一种语言的字符.如GBK包含所有汉字字符的字符集,ASCII包含英文字符的字符集
        //字符就是java中的char,char是character的简写

        //编码(Encoding)
        //char代表一个字符,char的本质也是数字.将数字映射到字符,就叫编码.
        //将一个字符集映射到数字,就是给这个字符集编码.编码是有标准的,是有所计算机系统按照同一个编码标准执行
        //有时候编码和字符集会混用

        //常用字符集
        // ASCII
        // Unicode,含世界上所有常用字符,编码有几种,UTF-8(8 bit Unicode Transformation Format),UTF-16等
        // Unicode,GBK等所有常用的字符集,都会兼容ASCII,例如字符A在这些常用字符集里,都对应数字65

        //java中的字符集
        // java中用的是UTF-16编码的Unicode
        // UTF-16用16个bit,即2个byte,这也就是char占用2个byte的原因.把char转成数字的时候,需要用int

        //转义符语法和常用的转义符
        // \n,换行符
        // \",双引号
        // \t,制表符
        String a = "a\tb\"\tcc\tee\t";
        String align = "1111222233334444";
        System.out.println(a);
        System.out.println("a\tb\tcc\tee\t");
        System.out.println(align);

        //字符串拼接
        System.out.println(a+align);
        int aa = 11;
        System.out.println("string"+aa);

    }
}
