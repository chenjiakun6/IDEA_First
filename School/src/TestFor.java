/**
 * @author alexander chan
 * for语句
 */
public class TestFor {
    public static void main(String[] args){
        int i,sum,m;
        for(i=1,m=1,sum=0;i<=10;i++){
            m*=i;
            sum+=m;
            System.out.println(sum);
        }

    }
}
