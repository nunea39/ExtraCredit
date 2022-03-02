
package com.mycompany.lab04_hw;

/**
 *  Write a function that prints "Hello World" n times recursively. 
 *  Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.
 *  Write a function that implements the binary search algorithm recursively.
 *
 * @author Andry
 */
public class Homework {
    
    /**
     * Function prints hello n amount of times 
     * @param n variable to countdown from 
     */
    void helloWorld(int n){
        
        if(n <= 0){
            return;
        }
        else 
            System.out.println("Hello World");
        
            helloWorld(n-1); // countdown by 1 until reach base case
        
    }
    
    /**
     * Function returns the sum of multiples of 7 within a range
     * 
     * @param n1 starting range
     * @param n2 ending range
     * @return the sum of multiples of 7
     */
    public static int countMultiples(int n1, int n2){ // n1 starting value to n2
        
        int cnt = 0; 
        for(int i = n1; i<=n2; i++){ // i = to the start and will end when reaches n2
            if(i % 7 == 0){
                cnt++;   // counts how many multples of 7 there are
            }
        }
        return cnt; // returns the sum of multiples of 7
    }
    
    
}
