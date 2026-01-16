package Array_Part2;

public class Trapping_Rainwater {
    public static int trappedRainwater(int height[]) {

        // 1. calculate left max boundry

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // 2. calculate right max boundry

        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedRainwater = 0;
        // 3. loop started

        for (int i = 0; i < height.length; i++) {
            // waterLevel = min(leftmax bound , rightmax bound)
            int wateraLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped ater = waterlevel - height[i];
            trappedRainwater += wateraLevel - height[i];
        }

        return trappedRainwater;

    }

   
    
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};

        int result = trappedRainwater(height);

        System.out.println("Trapped Rainwater is : "+result);
    }

}
