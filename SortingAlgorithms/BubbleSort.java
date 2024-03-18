import java.util.Arrays;

public class BubbleSort{
    public static void bubble(int[] arr){
        boolean swaped;
        for(int i=0;i<arr.length;i++){
            swaped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swaping will be done
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swaped=true;
                }

            }
            if(!swaped){
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr={5,4,1,2,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}