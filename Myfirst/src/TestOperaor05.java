/**
 * @author alexander chan
 * 条件运算
 */
public class TestOperaor05 {
    public static void main(String[] arg){
        int score=80;
        String type=score<60?"及格":"不及格";
        System.out.println(type);

        if(score<60){
            System.out.println("不及格");
        }
        else{
            System.out.println("及格");
        }
        int x=-1;
        System.out.println(x>0?1:(x==0?0:-1));



    }
}
