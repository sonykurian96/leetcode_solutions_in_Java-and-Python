class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int j=0;j<nums.length;j++){
            for(int i=j+1;i<nums.length;i++){
                if(nums[j]+nums[i] == target){
                    System.out.println(nums[j]+","+nums[i]);
                     result[0] = j;
                    result[1] = i;
                }
            }
        } 
    return result;
    }
}

// difficulty level - Easy
