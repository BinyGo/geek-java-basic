public class IfOperators {
    public static void main(String[] args){
        int baozi =3;
        boolean baoziStatus = true;
        if(baoziStatus) {
            System.out.println(baozi+10);
        } else if (baoziStatus && baozi>5) {
            if (baoziStatus){
                System.out.println(baozi+10);
            }else {
                System.out.println(baozi+2);
            }
        } else {
            System.out.println(baozi);
        }

        //简写 去大括号
        if (baoziStatus)
            System.out.println(baozi+10);
        else
            System.out.println(baozi+2);
    }


}
