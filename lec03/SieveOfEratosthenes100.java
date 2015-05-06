/*************************************************************************
 *  Compilation:  javac SieveOfEratosthenes100.java
 *  Execution:    java SieveOfEratosthenes100
 *    
 *  A program to implement the Sieve Of Eratosthenes algorithm to find
 *  out the prime number less or equal to 100
 *
 *************************************************************************/

public class SieveOfEratosthenes100 {
    public static void main(String[] args) {

        /* Initilize the array */
        int N = 100;
        int[] a = new int[N+1];
        for (int i = 0; i <= N; i++) {
            a[i] = i;
        }

        for (int i = 2; i <= N; i++) {
            /* i has already been filtered */
            if (a[i] == 0)
                continue;
            /* 
             * filter out the multiply of i
             * by setting a[i*j] to 0
             **/
            for (int j = 2; i*j <= N; j++) {
                a[i*j] = 0;
            }
        }

        /* print out the results */
        System.out.println("The following are the prime numbers within " + N);
        for (int i : a) {
            if (a[i] > 1)
                System.out.println(i);
        }
    }
}
