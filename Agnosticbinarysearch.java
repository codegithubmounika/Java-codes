//Agnositic BinarySearch to find the given array was sorted in ascending order descending order 
//and finding the target element using binary serach
public class Agnosticbinarysearch {
    public static int agnoisticbs(int arr[],int target){
        boolean isAsc=arr[0]<arr[arr.length-1];
        int startindex=0;
        int endindex=arr.length;

        while(startindex<=endindex){
            int midvalue=(startindex+endindex)/2;
            //middle value be same either arr ascending(asc)  or descinding(desc)
            if(target==arr[midvalue]){
                return midvalue;
            }
            //if asc na checking conditions will be one , if desc na checking conditions will be one
            if(isAsc){
                //for the asc order sorted array
                if(target<arr[midvalue]){
                    endindex=midvalue-1;
                }
                else{
                    startindex=midvalue+1;
                }
            }
            else{
                //for the desc order sorted array
                if(target>arr[midvalue]){
                    endindex=midvalue-1;
                }
                else{
                    startindex=midvalue+1;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target=6;
        int result=agnoisticbs(arr,target);
        System.out.println(result);
       
    }
}
