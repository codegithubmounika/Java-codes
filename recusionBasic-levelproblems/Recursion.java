import java.util.Arrays;
public class Recursion {
    //simple eg of recursion to understand the recursion
    public static void numbers(int n){
        if(n==5){//base condition for breking the function //else it will go infinity time give an error stackoverflow
            System.out.println(n);
            return;
        }
        System.out.println(n);
        numbers(n+1);//a function(numbers) calling itself  /called recursive
        //numbers(n+1) is the last function called in the function so it was called tail recursion
    }
    public static int factroial(int n){//fibonaci number
        if(n<2){
            return n;
        }
        return factroial(n-1)+factroial(n-2);  
    }
    public static int binarySearchusingRecusion(int[] arr,int target,int startindex,int endindex){
        //here the return type is there (int) ......
        if(startindex>endindex){//this base condition
            return -1;
        }
        int midvalue=startindex+(endindex-startindex)/2;
        if(arr[midvalue]==target){
            return  midvalue;
        }
        if(target<arr[midvalue]){
            endindex=midvalue-1;
            return binarySearchusingRecusion(arr, target, startindex, endindex);//this is the recusion function call 
            // before the int type return so we need to add return before the function call
            //and data type also will be same here int 
        }
        
        return binarySearchusingRecusion(arr, target, midvalue+1, endindex);
        
    }
    public static int linearserachusingRecursion(int[] arr,int target,int startindex,int endindex){
        if(startindex>endindex){
            return -1;
        }
        if(arr[startindex]!=target){
            startindex++;
            return linearserachusingRecursion(arr, target, startindex, endindex);
        }else{
            return startindex;
        }
    }
    public static int factorial(int n){
        if(n==1){
            return n;
        }
        return n*factorial(n-1);
    }
    public static int sumofNaturalnum(int n){
        if(n==1){
            return 1;
        }
        return n+sumofNaturalnum(n-1);
    }
    public static int noofdigits(int n){
        if(n==0){
            return 0;
        }
        return noofdigits(n/10)+1;
    }
    public static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        return sumofdigits(n/10)+n%10;
    }
    public static String reverseString(String s,String r,int i){
        // doubt
        if(i<0){
            return r;
        }
        return reverseString(s, r+s.charAt(i), i-1);
    }
    public static boolean palindrome(String s,int startindex,int endindex){
        if(endindex<=startindex){
            return true;
        }
        if(s.charAt(startindex)==s.charAt(endindex)){
            return palindrome(s, startindex+1, endindex-1);
        }
        else{
            return false;
        }
    }
    public static int sumofallelementsinArray(int[] arr,int i){
        if(i<0){
            return 0;
        }
        return arr[i]+sumofallelementsinArray(arr, i-1);
    }
    public static void tableofnum(int num,int i){
        if(i>10){
            return;
        }
        System.out.println(num+" * "+i+" = "+num*i);
        tableofnum(num, i+1);
    }
    public static void main(String[] args) {
        // numbers(1);
        // int ans=factroial(4);
        // System.out.println(ans);
        int[] arr={1,2,3,44,55,66};
        int target=66;
        int ans=binarySearchusingRecusion(arr,target,0,arr.length-1);
        System.out.println(ans);
        // int linans=linearserachusingRecursion(arr, target, 0,arr.length-1);
        // System.out.println(linans);
        // System.out.println(factorial(5));
        // System.out.println(sumofNaturalnum(4));
        // System.out.println(noofdigits(123456));
        // System.out.println(sumofdigits(5251));
        // String s="Mounika";
        // System.out.println(reverseString(s,"",s.length()-1));
        // String s="mam";
        // System.out.println(palindrome(s, 0, s.length()-1));
        // int[] arr={3,3,3};
        // System.out.println(sumofallelementsinArray(arr, arr.length-1));
        //tableofnum(5, 0);
    }
}
