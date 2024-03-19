package patterns;

public class Triangle1 {
    public static void pattern3(int n){
        for(int row=1;row<=n;row++){//if row starts with 1
            for(int col=5;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern3(5);
    }
}
