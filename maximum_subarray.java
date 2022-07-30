// best solution - O(n)

class Solution {
    public int maxSubArray(int[] nums) {
        int maxNum = nums[0];
        int curMax = 0;
        
        for(int i:nums){
            if(curMax < 0)
                curMax = 0;
            curMax = curMax + i;
            maxNum = Math.max(maxNum, curMax); 
        }
      return maxNum;  
    }
}
