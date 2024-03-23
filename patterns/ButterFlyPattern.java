package patterns;

public class ButterFlyPattern {
    public static void pattern29(int n){
        for(int row=1;row<=n;row++){
            System.out.print("*".repeat(row));
            System.out.print(" ".repeat(2*n-(2*row)));
            System.out.print("*".repeat(row));
            System.out.println();
        }
        for(int row=n-1;row>0;row--){//mirroing part
            System.out.print("*".repeat(row));
            System.out.print(" ".repeat(2*n-(2*row)));
            System.out.print("*".repeat(row));
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern29(5);
    }
}
