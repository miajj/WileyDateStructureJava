package MathematicalFoundations;

import java.util.Arrays;

/**
 * Created by mia on 27/01/2018.
 */
public class Foundations {


    /**
     * O(n).
     */
    public static double[] PrefixAverage(int[] A){
        double[] B = new double[A.length];
        double sum = 0;
        for(int i=0; i<A.length;i++){  //i=1
            sum += A[i];
            B[i] = sum/(i+1); //B1 = (A1 + B0)/2 = 2 + 1
        }
        return B;
    }

    /**
     * O(n).
     */

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * O(n**2).
     */

    public static boolean isUniqueLoop(int[] arr, int start, int end){
        if(start >= end)
            return true;
        for(int i = 0; i< end;i++)
            for(int j = i+1; j <= end; j++)
                if(arr[i]==arr[j])
                    return false;
        return true;
    }


    /**
     * O(nlogn).
     * Hash table is faster than it. 
     */
    public static boolean isUniqueSort(int[] arr, int start, int end){
        if(start >= end)
            return true;
        int[] buf = arr.clone();
        Arrays.sort(buf);   //O(nlogn).
        for(int i = 0; i< end;i++)
            if(buf[i] == buf[i+1]) return false; // O(n)
        return true;
    }


    public static void main(String[] args) {
        int[] A= {1,2,3,4,5,6};
        double[] B = PrefixAverage(A); // {1,1.5,2,2.5,3,3.5}
        System.out.println(Arrays.toString(B));

        int max = findMax(A);
        System.out.println(max);

        boolean isU = isUniqueLoop(A,0,A.length-1);
        boolean isUS = isUniqueSort(A,0,A.length-1);
        System.out.println(isU);
        System.out.println(isUS);

        int[] C = {1,2,3,4,5,1};
        boolean isUU = isUniqueLoop(C,0,C.length-1);
        boolean isUUS = isUniqueSort(C,0,C.length-1);
        System.out.println(isUU);
        System.out.println(isUUS);

    }

}
