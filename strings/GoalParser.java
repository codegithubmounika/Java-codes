package strings;
import java.util.ArrayList;
import java.util.Arrays;

public class GoalParser {
    //leetcode question no - 1678. Goal Parser Interpretation
    public static void goalParser(String g){
        String ans=" ";
        for(int i=0;i<g.length();i++){
            if((g.charAt(i)=='(') && (g.charAt(i+1)==')')){
                ans+='o';
            }
            else if((g.charAt(i)=='(') && (g.charAt(i+1)=='a') && (g.charAt(i+2)=='l') && (g.charAt(i+3)==')')){
                ans+='a';
                ans+='l';
            }
            else if(g.charAt(i)=='G'){
                ans+='G';
            }
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        String g="G()()()()(al)";
        goalParser(g);
    }
}
