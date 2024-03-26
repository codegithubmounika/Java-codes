package patterns;

public class DiamondPatternwithstars {
    public static void diamondpattern(int n){
        for(int row=1;row<=2*n;row++){
            int totalcolums=row>n?2*n-row:row;
            int noofspaces=n-totalcolums;
            for(int spaces=1;spaces<=noofspaces;spaces++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalcolums;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondpattern(5);
    }
}
