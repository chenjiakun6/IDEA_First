/**
 * @author alexander chan
 * break运用
 */
public class TestBreakLabel {
    public static void main(String[] args){
        int i,sum=0;
        for(i=1;i<=100;i++){
            if(i%15==0) break;
            sum+=i;
        }
        System.out.println("sum="+sum);
    }
}
