public class TrappingofRainWater{
    public static int trappingRainwater(int heights[]){
        //finding of left maximum of particular bar
        int n=heights.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=heights[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(heights[i],leftmax[i-1]);
        }
        //finding right maximum boundary of particular bar
        rightmax[n-1]=heights[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(heights[i],rightmax[i+1]);
        }
        //loop through respective bar
        int TrappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(rightmax[i],leftmax[i]);
            TrappedWater+=waterLevel-heights[i];
        }
        return TrappedWater;
        
    }
    public static void main(String[] args) {
        int heights1[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.err.println(trappingRainwater(heights1));
    }
}