import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    private static int f(int n,int[] val, int[] wt)
    { 
        if (n <= 0) 
            return 0; 
        int max_val = Integer.MIN_VALUE; 
        for (int i = 0; i<n; i++) 
            max_val = Math.max(max_val, 
                              price[i] + cutRod(price, n-i-1)); 
  
        return max_val; 
    } 
    public static void main(String args[]) 
    { 
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
        int size = arr.length; 
        System.out.println("El valor máximo es "+ 
                            cutRod(arr, size)+"obtenido"); 
  
    } 
} 