package sortingAlgorithmsusingRecursion;

import java.util.Arrays;

public class Quicksort {

    public static void quicksort(int[] arr,int low,int high){
        //final array condition violation after completion of sorting 
        if(low>=high){
            return;
        }
        //it was the start index of the array
        int start=low;
        //it was the end index of the array
        int end=high;
        int middle=start+(end-start)/2;
        int pivoit=arr[middle];
        //this will checking the internal itertion loop 
        while(start<=end){
            while(arr[start]<pivoit){
                start++;
            }
            while (arr[end]>pivoit) {
                end--;                
            }
            if(start<=end){
                //swapping will happen
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end++;
            }
            //this while loops are happening to make pivoit in the rite place
        }
        //for the left part of the piviot
        quicksort(arr, low,end);
        //for the rite part of the piviot
        quicksort(arr, start, high);
    }
    public static void main(String[] args) {
        int[] arr={1,4,3,2,5};
        quicksort(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));        
    }
    
}
