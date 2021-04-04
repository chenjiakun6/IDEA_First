/**
 * @author alexander chan
 *continue 语句
 */
public class TestContinue {
    public static void main(String[] srg){
        int i,sum=0;
        for(i=1;i<=100;i++){
            if(i%15==0) continue;
            sum+=i;
        }
        System.out.println("sum="+sum);
    }
}
