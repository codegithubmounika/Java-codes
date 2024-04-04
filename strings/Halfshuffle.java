package strings;

public class Halfshuffle {
    public static boolean halfshuffle(String complete){
        String sc="aeiou";
        int firsthalf=complete.length()/2;
        String lowercasestring=complete.toLowerCase();
        int count=0;
        for(int i=0;i<firsthalf;i++){
            if(sc.contains(String.valueOf(lowercasestring.charAt(i)))){
                count++;
            }
            
            
        }
        int scount=0;
         for(int i=firsthalf;i<complete.length();i++){//second half starting from next onwords
            if(sc.contains(String.valueOf(lowercasestring.charAt(i)))){
                scount++;
            }
            
            
        }
        if(count==scount){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String complete="book";
        boolean result=halfshuffle(complete);
        System.out.println(result);
    }
}
