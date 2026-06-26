package Array;

public class TrappingRainWater {
    public static int trapWater(int height[]){
        int n = height.length;
        //calc left max boundary - array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1;i<height.length;i++){
            leftmax[i]= Math.max(height[i],leftmax[i-1]);
        }
        //calc right max boundry - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        //loop
        int trap = 0;
        for(int i = 0;i<n;i++){
            //waterlevel = min(leftmax bond, right bond)
            int waterlevel = Math.min(leftmax[i],rightMax[i]);

            //trapped water = waterlevel - height[i]
            trap += waterlevel - height[i];

        }
        return trap;
    }
    public static void main(String[] args) {
    int[] height ={4,2,0,6,3,2,5};
    int trap = trapWater(height);
        System.out.println(trap);
    }
}
