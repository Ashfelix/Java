//package com.journaldev.java;
import java.util.*;

public class ARR {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int j= obj.nextInt();
        try{
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));
    }
    
    }
}