public class linearserach {
     public static int binarysearch(int arr[],int target){
        int startindex=0;
        int endindex=arr.length-1;
        while(startindex<=endindex){
            int midvalue=(startindex+endindex)/2;
            if(target>arr[midvalue]){
                startindex=midvalue+1;
            }
            else if(target<arr[midvalue]){
                endindex=midvalue-1;
            }
            else{
                return midvalue;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=14;
        System.out.println(binarysearch(arr, target));
    }
}
