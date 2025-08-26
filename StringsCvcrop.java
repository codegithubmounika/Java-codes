import java.util.*;

class StringsCvcrop{
    static boolean isomorphic(String s,String e){
        HashMap<Character,Character> h = new HashMap<>();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            char ec=e.charAt(i);
            if(h.containsKey(c)){
                if(h.get(c)!=ec){
                    return false;
                }
            }
            else{
                h.put(c, ec);
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isomorphic("moon", "feed"));
    }
}