package strings;

public class MergealternativelyStrings{
    //leetcode question n0 - 1768. Merge Strings Alternately

    public static void mergeStringsAlternatives(String s1,String s2){
        String newst=" ";
        int len=0;//taking the smallest len
        int largstr=0;//taking len of large string 
        String sc="";//taking for larger string adding last for remaing elements
        if(s1.length()<s2.length()){
            len=s1.length();
            largstr=s2.length();
            sc=s2;
        }else{
            len=s2.length();
            largstr=s1.length();
            sc=s1;
        }
        for(int i=0;i<len;i++){
            newst+=s1.charAt(i);
            newst+=s2.charAt(i);
            
        }
         for(int i=len;i<largstr;i++){
            newst+=sc.charAt(i);
            
        }
        System.out.println(newst);
        
        
    }

    public static void main(String[] args) {
        String s1="ab";
        String s2="pqrs";
        mergeStringsAlternatives(s1,s2);
    }
}