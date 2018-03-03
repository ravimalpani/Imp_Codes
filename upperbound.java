import java.io.*;
import java.util.*;

class UpperBound
 { 
 
   public static int bsub(int arr[],int low,int high,int value)
     {
       while(low <= high)
         {
           int mid = (low + high)/2;
           if((mid == (arr.length-1) || arr[mid+1] > value) && arr[mid] == value)
               return mid;
           else
             if(arr[mid] > value)
               high = mid - 1;
             else
                low = mid + 1;
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
        int mid = bsub(arr,0,a-1,value);
        System.out.println(mid);
    }
  }
     
