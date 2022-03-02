
package com.mycompany.lab04_hw;

/**
 * what is the time complexity of this algorithm and why?
 * Answer : O(2^n) exponential time complexity. 
 * The algorithm will recursively call itself twice until n either equals 0 or 1.
 * Because its breaking each call down to two more calls, the time complexity will grow exponentially.
 * 
 * @author Andry
 */
public class Task03 {
    
    int fib(int n)

{

       if (n <= 0) // base case

            return 0;

      else if (n == 1) // base case

             return 1;

       else

             return -1; // fib(n – 1) + fib(n – 2); 

}
    
}
