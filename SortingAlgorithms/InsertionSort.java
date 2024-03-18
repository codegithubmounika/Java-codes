import java.util.Arrays;

public class InsertionSort {
    public static void swap(int[] arr,int first,int second){//swaping maxindex and largetrt position
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void insertionsort(int[] arr){
       for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;//if eg 3<5 this before of 3 sorted so need to check so break the loop
                }
            }
            
        }
    }
    public static void main(String[] args) {
         int[] arr={5,4,1,2,9};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }   
    
}
