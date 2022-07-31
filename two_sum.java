// slower but easy to understand
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        
        for(int outside=0; outside<nums.length; outside++){
            for(int inside=0;inside<nums.length - 1;inside++){
                if(nums[outside]+nums[inside + 1] == target){
                    if(outside != inside + 1){
                     result[0] = outside;
                    result[1] = inside + 1;
                    }
                }
            }
        } 
    return result;
    }
}

// faster
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
