/**
 * @author alexander chan
 *
 */
public class CopyArray {
    public static void main(String args[]){
        int array_a[]=new int[]{5,34,15,27,96,63,78,47,50,82};
        int array_b[]=new int[]{0,0,0,0,0,0,0,0,0,0};
        System.arraycopy(array_b,2,array_a,3,5);
        for(int x:array_a)
            System.out.print(x+" ");
    }
}
