public class RotatedBinarySerach {
    public static void rotationarrysearch(int[] arr,int targetel){
        int pvoit=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[0]<arr[i]){
                pvoit=arr[i];
            }
        }
        System.out.println(pvoit);
        if(arr[0]>targetel){
            int startindexvalue=arr[pvoit]+1; 
            int endindexvalue=arr.length;
            System.out.println(searchspace(arr, startindexvalue, startindexvalue,targetel));
        }else{
            int startindexvalue=0; 
            int endindexvalue=arr[pvoit]-1;
            System.out.println(searchspace(arr, startindexvalue, startindexvalue,targetel));
        }
    }
    public static int searchspace(int[] arr,int startindex,int endindex,int target){
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
        int[] arr={4,5,6,7,0,1,2,3};    
        rotationarrysearch(arr, 0);//printing pivoit and index of the target element
    }
}
