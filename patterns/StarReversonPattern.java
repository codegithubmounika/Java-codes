package patterns;

public class StarReversonPattern {
    public static void pattern7(int n){
        for(int row=n;row>=1;row--){
            System.out.print(" ".repeat(n-row));
            System.out.print("*".repeat(row));
           
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        pattern7(6);
    }
}
