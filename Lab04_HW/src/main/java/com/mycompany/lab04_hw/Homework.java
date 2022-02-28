
package com.mycompany.lab04_hw;

/**
 *  Write a function that prints "Hello World" n times recursively. 
 *  Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.
 *  Write a function that implements the binary search algorithm recursively.
 *
 * @author Andry
 */
public class Homework {
    
    void helloWorld(int n){
        
        if(n <= 0){
            return;
        }
        else 
            System.out.println("Hello World");
        
            helloWorld(n-1);
        
    }
    
    
    
}
