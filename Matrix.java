import java.util.Arrays;

public class Matrix {
    public static void transposeofmatrix(int[][] arr){
        //here new traspose array which was using the col*row of original matrix
        int[][] tranposrarr=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                //swaping takes place
                tranposrarr[j][i]=arr[i][j];

                
            }
        }
        //printing the sorted arrays
        for(int i=0;i<tranposrarr.length;i++){
            System.out.println(Arrays.toString(tranposrarr[i]));
        }
       
        
    }
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        transposeofmatrix(arr);
    }
    
}
