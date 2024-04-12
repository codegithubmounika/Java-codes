package strings;

public class Leetstring {
    public static int firstocuurencestring(String needle,String haystack){
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        String needle="leet";
        String haystack="leetcode";
        System.out.println(firstocuurencestring(needle, haystack));
    }
}
