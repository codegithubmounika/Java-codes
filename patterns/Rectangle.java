package patterns;
public class Rectangle{
    //rrectangular pattern
    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            System.out.println("* ".repeat(n));
            
        }
    }
    public static void main(String[] args) {
        pattern1(5);
    }
    
}