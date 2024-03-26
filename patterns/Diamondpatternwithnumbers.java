 package patterns;

class Dimonadpatternwithnumbers {
    public static void numberpattern(int n){
        for(int row=1;row<=2*n;row++){
            int noofcols=row>n?2*n-row:row;
            int noofspaces=n-noofcols;
            for(int spaces=1;spaces<=noofspaces;spaces++){
                System.out.print(" ");
            }
            for(int col=noofcols;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=noofcols;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        numberpattern(5);
    }
    
}