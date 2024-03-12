public class FindingminEle{
    public static int minarray(int minarr[],int start,int end){
        int ans=minarr[start];
        for(int i=start;i<=end;i++){
            if(ans>minarr[i]){
                ans=minarr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,5,78};
        System.out.println(minarray(arr, 0, arr.length-1));

    }
}