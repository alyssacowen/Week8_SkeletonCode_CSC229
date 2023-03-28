/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        
        // Todo 01: - complete the implementation of linear search and test your code
        for (int i = 0; i < n ; i++) {
            if(arr[i] == x){
                return i; //x is the integer/element that is being searched for, this will iterate through the array's elements, if x is found it will return i which is the index x can be found at in the array
            }
        }
        return -1; //during the linear search, if x is never found, this function will return -1
//         - provide asymptotic analysis of the developed solution
//
// upper bound is O(n)
//lower bound is big omega(n)
//tight bound is theta(n)
    }
    
    
    
}
