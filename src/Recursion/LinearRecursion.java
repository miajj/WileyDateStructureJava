package Recursion;
import java.util.Arrays;

 /**
 * Created by mia on 25/01/2018.
 */
 public class LinearRecursion {

 public static int recursive(int n) {
 if (n == 0)
 return 1;
 else return n * recursive(n-1);

 }

 public static int linearSum(int[] A, int n){
 if (n == 1)
 return A[0];
 else
 return A[n-1] + linearSum(A,n-1);
 }

 public static void reverseArray(int[] A, int start, int end){
 if (start < end) {
 int temp = A[start];
 A[start] = A[end];
 A[end] = temp;
 reverseArray(A, start + 1, end - 1);
 }
 //return;
 }

    /**
     * When computer memory is at a premium, it is useful to derive non-recursive algorithms for recursive one.
     *  Tail recursion: if it uses linear recursion and the algorithm makes a recursive call as its very last operation.
     */

public static void IterativeReverseArray(int[] A, int start, int end){
        while (start < end) {
        int temp = A[start];
        A[start] = A[end];
            A[end] = temp;
            start ++;
            end --;
        }
        //return;
    }


    public static void main(String[] args) {
        int r = recursive(5);
        System.out.println(r);
        int[] A = {4, 3,6, 2,5};
        int[] B = {4, 3,6, 2,5};
        int sum = linearSum(A, A.length);
        System.out.println(sum);

        reverseArray(A,0,A.length-1);
        System.out.println(Arrays.toString(A));


        IterativeReverseArray(B,0,B.length-1);
        System.out.println(Arrays.toString(B));

    }

}