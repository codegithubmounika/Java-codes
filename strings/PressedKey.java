package strings;

public class PressedKey {
    public static boolean pressedkey(String sc,String typed){
        boolean ans=true;
        int i=0;
        while(i<sc.length()){
            if(typed.indexOf(typed.charAt(i))==typed.lastIndexOf(typed.charAt(i))){//for single letter the indexof and lastindexof will be equal
                ans=false;
                break;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        String sc="saeed";
        String typed="ssaaeedd";
        boolean res=pressedkey(sc,typed);
        System.out.println(res);
    }
    
}
