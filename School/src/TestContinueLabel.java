/**
 * @author alexander chan
 * Continue 语句运用
 */
public class TestContinueLabel {
    public static void main(String[] args){
        outer:for(int i=1;i<=10;i++){
        //给外循环添加一个标签outer
        for(int j=1;j<=10;j++){
            if(j>i){
                System.out.println();
                continue outer;
            }
            System.out.println(+i+"*"+j+"=" +(i*j)+"  ");
        }
        }
        System.out.println();
    }
}
