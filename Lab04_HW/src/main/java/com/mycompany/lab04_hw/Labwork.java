
package com.mycompany.lab04_hw;

import java.util.Scanner;

/**
 *
 * @author Andry Nunez
 */
public class Labwork {
    
    public static void main(String[] args){
        
        Task01 task01 = new Task01();
        Task02 task02 = new Task02();
        Homework hw1 = new Homework();


        task01.countDown(5);
        System.out.println();
        
        System.out.print("GCD is  " + task02.gcd(70, 60));
        System.out.println("\n");
        
        hw1.helloWorld(10);
        
       
    }
    

}