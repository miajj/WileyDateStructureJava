package UsingArray;

/**
 * Created by mia on 24/01/2018.
 * Note: there is a slight chance that the old and num arrays will be equal even after num is sorted, if num is already sorted.
 */
import java.util.Arrays;
import java.util.Random;
/** Program showing some array uses. */
public class ArrayTest {
    public static void main(String[] args) {
        int num[] = new int[10];
        Random rand = new Random();  // a pseudo-random number generator
        rand.setSeed(System.currentTimeMillis()); // use current time as a seed
        // fill the num array with pseudo-random numbers from 0 to 99, inclusive
        for (int i = 0; i < num.length; i++)
            num[i] = rand.nextInt(100); // the next pseudo-random number
        int[] old = (int[]) num.clone();	  // cloning the num array
        System.out.println("arrays equal before sort: " + Arrays.equals(old,num));
        Arrays.sort(num); // sorting the num array (old is unchanged)
        System.out.println("arrays equal after sort: " + Arrays.equals(old,num));
        System.out.println("old = " + Arrays.toString(old));
        System.out.println("num = " + Arrays.toString(num));
    }
}
