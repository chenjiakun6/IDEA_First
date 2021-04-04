/**
 * @author alexander chan
 * Switch 语句的运用
 */
public class TestSwitch {
    public static void main(String[] arg){
        int score=95;
        int i=score/10;
        switch(i) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("优良");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 6:
                System.out.println("及格");
                break;
            default :
                System.out.println("不及格");

        }
    }
}
