/**
 * @author alexander chan
 * 位运算
 * 字符串连接符
 */
public class TestOperator04 {
    public static void main(String[] arg){
        int a=3;
        int b=4;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a);

        //位移
        int c=3<<2;
        int c2=3>>2;
        System.out.println(c);
        System.out.println(c2);

        String d="3";
        int e=4;
        int f=5;
        char g='a';
        System.out.println(d+e+f);
        System.out.println(e+f+d);
        System.out.println(g+1);




    }
}
