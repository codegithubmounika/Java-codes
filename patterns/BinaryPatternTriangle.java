package patterns;

public class BinaryPatternTriangle {
    public static void pattern22(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                if((row+col)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern22(5);
    }
}
