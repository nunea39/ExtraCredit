
package com.mycompany.lab04_hw;

/**
 * what is the output of this code? 
 * Answer: ... .... .... .... Blastoff. 
 * Depending on the int entered for num, the program will print ... until the countdown reaches 0, then it will print blastoff. 
 *
 *  - modify it so that it prints only the even numbers. 
 *
 *  - what is the time complexity of this algorithm and why?
 * Answer: O(n)
 * The algorithm is going to recursively reduce by 1, which is a constant. So the algorithms time complexity would mostly depend on int num or n.  
 * @author Andry
 */
public class Task01 {

      void countDown(int num){
 
            if (num == 0){ // test

                System.out.println("Blastoff!");
            }
            else {
                
                if(num %2 == 0){ // num % 2 returns the division remainder, if the remainder equals 0, print

                System.out.println("... " + num);// num to see if the numbers are even 

                }
                
                countDown(num-1); // recursive call
            } 
        }  
}
