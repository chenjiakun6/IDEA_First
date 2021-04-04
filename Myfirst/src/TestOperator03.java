/**
 * @author alexander chan
 * 逻辑运算
 */
public class TestOperator03 {
    public static void main(String[] arrg){
        boolean b1=true;
        boolean b2=false;
        System.out.println(b1&b2);
        System.out.println(b1|b2);
        System.out.println(b1&&b2);
        System.out.println(b1||b2);
        System.out.println(b1^b2);
        System.out.println(!b2);
        System.out.println(!b1);

        //测试短路
      //  int c=3/0;
        boolean b3=1>2&&2<(3/0);
        System.out.println(b3);

    }
}
