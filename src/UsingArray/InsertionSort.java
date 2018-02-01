package UsingArray;

/**
 * Created by mia on 24/01/2018.
 */
public class InsertionSort {

    public static void InsertionSort(int[] A){
        for (int i = 1; i < A.length; i++){
            int temp = A[i];
            int j = i-1;
            while((j>=0)&&(A[j]>temp))
                A[j+1] = A[j--];
            A[j+1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] A = {2,5,7,1,3};

        InsertionSort(A);

        for (int a : A){
            System.out.println(a);
        }

//        int b = 10;
//
//        System.out.println(--b);

    }

}
