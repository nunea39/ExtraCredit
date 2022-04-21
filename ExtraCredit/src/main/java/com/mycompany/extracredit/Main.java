/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.extracredit;

/**
 * an algorithm that can find the ratio of the sum of the largest 
 * two numbers divided by the sum of the smallest two numbers in an array.
 *
 * @author Andry Nunez
 */
public class Main {
    
    public static void main(String[] args){
        
        int [] arr = new int [] {3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
        
        
        System.out.println("Dividing largest by smallest is "+twoValues(arr));
        

        
    }
    public static double twoValues(int [] arr){
        double largestA = Integer.MIN_VALUE;
        double largestB = Integer.MIN_VALUE;
        double smallestA = Integer.MAX_VALUE ;
        double smallestB  = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            int current = arr[i];
            
            if(current > largestA){
                largestB = largestA;
                largestA = current;
            }
            else if(current > largestB){
                largestB = current;
            }
            if(current < smallestA){
                smallestB = smallestA;
                smallestA = current;
            }
            else if(current < smallestB){
                smallestB = current;
            }
        }
        
        System.out.println("Two largest values " + largestA + " + " + largestB + "\nTwo smallest values " + smallestA + " + " + smallestB); 
        return (largestA+largestB)/(smallestA+smallestB);

    }
    
}
