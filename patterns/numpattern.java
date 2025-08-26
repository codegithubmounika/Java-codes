package patterns;

public class Numpattern {
    public static void num(int n){//correction of patterns
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            for(int spaces=1;spaces<=2*n-(2*row);spaces++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            System.out.println();
        }
    }  
    public static void main(String[] args) {
        num(5);
    }  
}
