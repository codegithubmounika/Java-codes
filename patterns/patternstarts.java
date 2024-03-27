package patterns;

public class patternstarts {
    public static void pattern12(int n){
        for(int row=0;row<5;row++){
            for(int spaces=0;spaces<row;spaces++){
                System.out.print(" ");
            }
            for(int col=1;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=5;row++){
            System.out.print(" ".repeat(n-row));
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern12(5);
    }
}
