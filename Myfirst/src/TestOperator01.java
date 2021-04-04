/**
 * @author alexander chan
 * 测试运算符
 */
public class TestOperator01 {
    public static void main(String[] arg){
       /* byte a=1;
        int b=2;
        //byte c=a+b;//报错
        long c=b+a;
        float pi=3.14f;
        System.out.println(7%-3);
        */
       //测试自增自减
        int a=1;
        int b=a++;//先给b赋值再自增
        System.out.println("a="+a+"\nb="+b);
        a=3;
        b=++a;
        System.out.println("a="+a+"\nb="+b);
        a*=b+1;//表示a*(b+1)




    }


}
