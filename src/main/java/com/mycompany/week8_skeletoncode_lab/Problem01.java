/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static long getSumOfPrimes(int n){
       long sum = 0;
       for (int i = 2; i <= n; i++){
           if(isPrime(i)){
               sum+=i;
           }
       }
return sum;
}
}
  



    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
//isPrime time complexity is O(sqrt(n)) and the space complexity is O(1)
//getSumOfPrimes time complexity is O(n*sqrt(n)) and the space complexity is O(1)
    
    
  