import java.util.Arrays;

public class SelectionSort {
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-1-i;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    public static void swap(int[] arr,int first,int second){//swaping maxindex and largetrt position
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static int getMaxIndex(int[] arr,int start,int end){//finding maximum element and getting maxelemnt index
        int max=start;
        for(int i=start+1;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={5,4,1,2,9};
       selectionsort(arr);
       System.out.println(Arrays.toString(arr));//here object reference to the same value
    }
    
    
}
