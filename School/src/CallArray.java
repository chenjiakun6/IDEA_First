/**
 * @author alexander chan
 */
public class CallArray {
    static void f(int x){
        x=10;
    }
    static void fArray(int[] anArray){
        anArray[0]=10;
    }
    public static void main(String[] args){
        int x=0;
        f(x);
        System.out.println("x="+x);
        int[]array={0,1};
        fArray(array);
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
