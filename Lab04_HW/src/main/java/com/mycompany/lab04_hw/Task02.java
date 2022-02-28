
package com.mycompany.lab04_hw;

/**
 * what is the output of this code? 
 * The greatest common divisor between both numbers. If there is no remainder the greatest common divisor would be Y.
 * Or if the remainder isn't 0, then repeat dividing until the remainder is 0 to get the common divisor
 *
 *   - modify it to find the gcd using subtraction instead of %.
 * @author Andry
 */
public class Task02 {

    int gcd(int x, int y) {

      if (x == 0){ //base case

        return y;
      }
      while (y != 0){
          
        System.out.println("x:" + x + "  " +"y:"+ y); // helps me see the values changing 
        
        if(x > y){
            x = x-y;
        }
        else{
            y = y-x;
        }
      }
      return x;

}
    
}
