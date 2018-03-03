

import java.io.*;
import java.util.*;

class LowerValue
 { 
 
   public static int bslv(int arr[],int low,int high,int value)
     {
       while(low <= high)
         {
           int mid = (low + high)/2;
           if((mid == (arr.length-1) || arr[mid+1] >= value) && arr[mid] < value)
               return mid;
           else
             if(arr[mid] < value)
               low = mid + 1;
             else
                high = mid - 1;
       }
         return -1;
        }
        
  
   public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] =  new int[a];
        for(int i = 0; i < a; i++) 
         {
           arr[i] = sc.nextInt();
          }
        int value = sc.nextInt();
        Arrays.sort(arr);
        int mid = bslv(arr,0,a-1,value);
        System.out.println(arr[mid]);
    }
  }
     
