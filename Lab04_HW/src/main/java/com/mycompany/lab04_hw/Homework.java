
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
    
    /**
     * Function implements binary search recursively
     * 
     * @param arr the array for the function to search
     * @param start int to set boundary for left index
     * @param end int to set boundary for right index
     * @param x int the function will search for
     * @return returns -1 if we cant find int x or the index where int x was found
     */
    int binarySearch (int arr[], int start, int end, int search){
        
        if(start <= end){
            
            int middle = (start + end) / 2; 
            
            if(arr[middle] == search){ // base case
                return middle;
            }
            if (arr[middle] > search){ // will recursively run the function and change the right index to the middle -1
                return binarySearch(arr, start, middle -1, search);
            }
            if (arr[middle] < search){  // will recursively run the function and change the left index to start in the middle 
                return binarySearch(arr, middle +1, end, search);
            }
                            
        }
        return -1; // if the element is not found in the array 
    }
    
}
