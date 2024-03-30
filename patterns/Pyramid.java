package patterns;

public class Pyramid{

    public static void pattern10(int n){
        for(int row=1;row<=5;row++){
            System.out.print(" ".repeat(n-row));
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern10(5);
    }
}