package sortingAlgorithmsusingRecursion;

import java.util.Arrays;

public class Mergesort{

    public static int[] sorting(int[] left,int[] right){
        int[] newsortedArray=new int[left.length+right.length];
        int leftarrayindex=0;
        int rightarrayindex=0;
        int newarrayindex=0;
        //this is using for the sorting purpose after each every call
        while (leftarrayindex<left.length && rightarrayindex<right.length) {
            if(left[leftarrayindex]<right[rightarrayindex]){
                newsortedArray[newarrayindex]=left[leftarrayindex];
                leftarrayindex++;
            }   
            else{
                newsortedArray[newarrayindex]=right[rightarrayindex];
                rightarrayindex++;
            } 
            newarrayindex++;        
        }
        //it may be one of the array has the more values which the length of either be greater
        while(leftarrayindex<left.length){
            newsortedArray[newarrayindex]=left[leftarrayindex];
            leftarrayindex++;
            newarrayindex++;

        }
        while(rightarrayindex<right.length){
            newsortedArray[newarrayindex]=right[rightarrayindex];
            rightarrayindex++;
            newarrayindex++;

        }
        return newsortedArray;

    }

    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int midvalue=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr, 0, midvalue));
        int[] right=mergeSort(Arrays.copyOfRange(arr,midvalue,arr.length));
        return sorting(left,right);
    }
   
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int[] newarr=mergeSort(arr);
        System.out.print(Arrays.toString(newarr));
    }
}