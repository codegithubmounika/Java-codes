package patterns;

public class StarsPattern {
    public static void pattern5(int n){
        for(int row=1;row<=2*n-1;row++){
            if(row<=n){
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int col=n;col>=row-n+1;col--){//need to solve this
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        pattern5(5);
    }
}
