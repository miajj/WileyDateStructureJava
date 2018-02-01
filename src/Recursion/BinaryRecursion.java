package Recursion;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by mia on 26/01/2018.
 * BinaryRecursion: two recursive call.
 */
public class BinaryRecursion {


    /**
     * This is a problem that needs to be fixed.???
     *
     */
    public static int BinarySum(int[] A, int i, int n){
        if (n == 1)
            return A[i];
        else return BinarySum(A,i,n/2)+BinarySum(A,i+n/2,n/2);

    }

    public static int BinaryFib(int k){
        if (k <= 1)
            return k;
        else return BinaryFib(k-1)+ BinaryFib(k-2);
    }



    public static void main(String[] args) {

        int[] A = {4,3,6,2,5,10,5,5};
        int sum = BinarySum(A,0,A.length);
        System.out.println(sum);

//        int[] B = {4,3,6,2,5,10};
//        int sumb = BinarySum(B,0,B.length);
//        System.out.println(sumb);

        System.out.println(BinaryFib(8));

    }

}
