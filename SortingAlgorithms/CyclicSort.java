import java.util.Arrays;

public class CyclicSort {
    public static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=(arr[correct])){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    public static void swap(int[] arr,int first,int second){//swaping maxindex and largetrt position
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2,};
        cyclic(arr);
        System.out.print(Arrays.toString(arr));
    }
}
