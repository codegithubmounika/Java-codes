package strings;

public class BiryaniString {
    //leetcode question no - 1784
    //Q Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.
    public static boolean biryaniStringi(String sc){
        boolean ans=false;
        for(int i=0;i<sc.length();i++){
            if(sc.charAt(i)=='1' && sc.charAt(i+1)=='1'){//doubt for index morethan 4
                ans=true;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String sc="110";
        System.out.println(biryaniStringi(sc));
    }
}
