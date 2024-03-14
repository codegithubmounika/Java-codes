public class Diagonalsum {
          //using bruteforce techinque
          public static int matrixsum(int matrix[][]){
            int sum=0;
            for(int i=0;i<=matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(i==j){
                        sum+=matrix[i][j];
                    }
                    else if(i+j==matrix.length-1){
                        sum+=matrix[i][j];
                    }
                }
                
            }
            return sum;
            
        }


        //using single loop
        public static int usingsingleloop(int matrix[][]){
            int sum=0;
            for(int i=0;i<matrix.length;i++){
                //primary diagonal sum
                sum+=matrix[i][i];
                //secondary digonal sum
                if(i!=matrix.length-i-1){//removing for repitation of element
                    sum+=matrix[i][matrix.length-i-1];
                }
                
            }
            return sum;
        }
        
        public static void main(String[] args) {
            int matrix[][]={{1,2,3},
                            {4,5,6},
                            {7,8,9}};
          System.out.println(matrixsum(matrix));
          System.out.println(usingsingleloop(matrix));
        }
}
