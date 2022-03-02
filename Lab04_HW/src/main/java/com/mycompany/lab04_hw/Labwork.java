
package com.mycompany.lab04_hw;

import java.util.Scanner;

/**
 * main driver class with the lab and homework task
 *
 * @author Andry Nunez
 */
public class Labwork {
    
    public static void main(String[] args){
        
//        Task01 task01 = new Task01();
//        Task02 task02 = new Task02();
//        
        Homework hw1 = new Homework();
        Homework hw2 = new Homework();


//        task01.countDown(5);
//        System.out.println();
//        
//        System.out.print("GCD is  " + task02.gcd(70, 60));
//        System.out.println("\n");
      
        
        
        //Homework task 1
        hw1.helloWorld(10);
        System.out.println();
        
        //Homework task 2
        System.out.println("Sum of multiples of 7 : " + Homework.countMultiples(36,77));
        System.out.println();
    
        //Homework task 3
        
            int arr[] = {0,10,20,30,40,50,60,70,80,90,100};
            int start = 0;
            int end = arr.length -1;
            int search = 30;
            int result = hw2.binarySearch(arr, start, end , search);
            
            if(result == -1){
                System.out.println("Element not found");
            }
            else{
                System.out.println("Element found at index " + result);
            }
          
       
    }
}