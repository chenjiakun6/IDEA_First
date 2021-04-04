/**
 * @author alexander chan
 */
public class ArrayTest1 {
    public static void main(String[] arg){
        float[][] numthree; //定义一个float类型的二维数组
        numthree=new float[5][5];
        numthree[0][0]=1.1f;
        numthree[1][0]=1.2f;
        numthree[2][0]=1.3f;
        numthree[3][0]=1.4f;
        numthree[4][0]=1.5f;
        System.out.println(numthree[0][0]);
        System.out.println(numthree[1][0]);
        System.out.println(numthree[2][0]);
        System.out.println(numthree[3][0]);
        System.out.println(numthree[4][0]);
    }
}
