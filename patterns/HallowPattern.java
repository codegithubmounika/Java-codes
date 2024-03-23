package patterns;

public class HallowPattern {
    public static void hallowpattern(int n){
        for(int row=1;row<=n;row++){
            System.out.print(" ".repeat(n-row));
            for(int col=1;col<=row;col++){
                if(col==1 || col==row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");//here adding 2 spaces in between "  "
                }
            }
            
            System.out.println();
        }
         for(int row=n;row>=1;row--){
            System.out.print(" ".repeat(n-row));
            for(int col=1;col<=row;col++){
                if(col==1 || col==row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");//here adding 2 spaces in between "  "
                }
            }
            
            System.out.println();
        }

    }
    public static void main(String[] args) {
        hallowpattern(5);
    }
}
