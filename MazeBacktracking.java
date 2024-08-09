import java.util.Arrays;

public class MazeBacktracking {
    static void pathsWithRestrictions(String p,boolean[][] maze,int r,int c,int[][] path,int steps){
        if(r==maze.length-1 && c==maze[0].length-1){
            for(int i=0;i<path.length;i++){
                System.out.println(Arrays.toString(path[i]));
            }
            System.out.println(steps);
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){//here it was checking the condition if cells is true it will give the another function call excute
            return;
        }
        //this false means it was the marking the visitied  cells 
        maze[r][c]=false;
        //here counting the apdated the cell (r and c) by using the step
        path[r][c]=steps;
    
        if(r<maze[0].length-1){
            pathsWithRestrictions(p+'D', maze, r+1, c,path,steps+1);//here condition because if r==1 we need to excute the column one
        }

        
        if(c<maze.length-1){
            pathsWithRestrictions(p+'R', maze, r, c+1,path,steps+1);//here condition because if c==1 we need to excute the row one
        }

        if(r>0){
            pathsWithRestrictions(p+'U', maze, r-1, c,path,steps+1);
        }
        if(c>0){
            pathsWithRestrictions(p+'L', maze, r, c-1,path,steps+1);
        }
        maze[r][c]=true;
        //after completion of the recurrsion the call for next rescurssion calls it giving the path by making the 
        //cells as the again true
        path[r][c]=0;
        //after cells was added we need to upadate the value 0 while backtarcking
    }
    public static void main(String[] args) {
        boolean arr[][]={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path= new int[arr.length][arr[0].length];
        pathsWithRestrictions("",arr,0 ,0,path,1);        
    }
}
