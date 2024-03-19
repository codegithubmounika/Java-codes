package patterns;
//printing the Right Angled Triangle
public class Triangle {
    public static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern2(4);
    }
}
