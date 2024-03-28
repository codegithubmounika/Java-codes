package patterns;

public class Numberpattern{
    public static void nums(int n){
        for(int row=1;row<=n;row++){
            for(int col=0;col<=n-row;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        nums(5);  
    }
}