/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

import static com.mycompany.week8_skeletoncode_lab.BinarySearch.runBinarySearchIteratively;
import static com.mycompany.week8_skeletoncode_lab.BubbleSort.bubbleSort;
import static com.mycompany.week8_skeletoncode_lab.LinearSearch.search;



/**
 *
 * @author alyss
 */
public class Main {
    public static void main(String[] args) {
        //Linear Search 
        int arr[]={5,20,7,9,31,4};
        int x = 7;
        int Linearindex = search(arr,x);
        if (Linearindex > -1){
            System.out.println("During the linear search, integer " + x + " is in the arr array at index " + Linearindex);
        }
        else{
            System.out.println("There is no occurence of integer " + x + " in the arr array");
             //I chose 7 as the x and since 7 is in the array, after running this code, the output was "During the linear search, integer 7 is in the array at index 2"
        }
        //Binary Search
        int[] sortedArray = {1,19,31,44,77,84};
        int key = 19;
        int low = 0;
        int high = 5;
        int index = runBinarySearchIteratively(sortedArray, key, low, high);
        System.out.println("During the binary search, integer " + key + " can be found at index " + index + " in the array sortedArray.");
        
        //Bubble Sort
        int[] a = {55,920,705,2,72,19};
        int size=6;
        bubbleSort(a, size);
        System.out.println("Array 'a' sorted after using bubble sort method: ");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }
    }
    }

   

