package patterns;

public class Starpattern {
    public static void star(int n){
        for(int row=1;row<=n;row++){
            System.out.print(" ".repeat(n-row));
            System.out.print("*".repeat(row));
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        star(6);
    }
}
