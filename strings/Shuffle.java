package strings;

public class Suffle {
    //leetcode question no - 1528 Shuffle  the String
    public static void shuffle(int arr[],String c){
        StringBuilder n=new StringBuilder("");
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<arr.length;j++){//finding the particaular index in the array and append by char of that particular index
                if(i==arr[j]){
                    n.append(c.charAt(j));
                }
            }
        }
        System.out.print(n);


    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,2,1,3};
        String c="codeleet";
        shuffle(arr, c);
    }
}
