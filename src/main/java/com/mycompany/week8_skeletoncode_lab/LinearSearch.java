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
    }
    public static void main(String[] args) {
        int arr[]={5,20,7,9,31,4};
        int x = 7;
        int index = search(arr,x);
        if (index > -1){
            System.out.println("Integer " + x + " is in the array at index " + index);
        }
        else{
            System.out.println("There is no occurence of integer " + x + " in the array");
        }
    }
    //I chose 7 as the x and since 7 is in the array, after running this code, the output was "Integer 7 is in the array at index 2"
    
    
}
