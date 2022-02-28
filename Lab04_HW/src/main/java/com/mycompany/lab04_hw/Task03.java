
package com.mycompany.lab04_hw;

/**
 * what is the time complexity of this algorithm and why?
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

             return fib(n – 1) + fib(n – 2);

}
    
}
