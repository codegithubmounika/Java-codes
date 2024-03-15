public class ShortestPath {
    //problem statement "Finding the displacment based given direction string  on the xy plane "
    public static float directionpath(String directionstring){
        int x=0;
        int y=0;
        //iteration through direction string
        for(int i=0;i<directionstring.length();i++){
            char c=directionstring.charAt(i);
            //north
            if(c=='N'){
                y++;
            }
            //south
            else if(c=='S'){
                y--;
            }
            //east 
            else if(c=='E'){
                x++;
            }
            //west
            else{
                x--;
            }
        }
        //starting from origin(0,0) ending points are x2 and y2 finding distance b/w two points called displacement
        int x2=x*x;
        int y2=y*y;

        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String directionstring="WNEENESENNN";
        float result=directionpath(directionstring);
        System.out.println(result);
    }
}
