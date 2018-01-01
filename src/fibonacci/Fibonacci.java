

/*
 * Print first 20 Fibonacci numbers and their average
 */
package fibonacci;

/**
 *
 * @author Japreet
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int n = 3;          // the index n for F(n), starting from n=3 because first two values are 1 and 1
      int fn;             // F(n) to be computed
      int fnMinus1 = 1;   // F(n-1), init to F(2)
      int fnMinus2 = 1;   // F(n-2), init to F(1)
      int nMax = 20;      // no of counts
      int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
      double average;
        
      System.out.println("The first " + nMax + " Fibonacci numbers are:");
        System.out.print(fnMinus2+", "+fnMinus1+"," );
        while (n <= nMax) {  // n starts from 3
        fn = fnMinus1+fnMinus2; // Compute F(n), print it and add to sum
        System.out.print(fn+ ",");
        sum=fn+sum;
        //Increment the index n and shift the numbers for the next iteration
         ++n;
         fnMinus2 = fnMinus1; 
         fnMinus1 = fn;
      }
      average=sum/(double)20;
      System.out.println("");
      System.out.println("the average of the fibonacci series is "+average);
      
    }
    
}
