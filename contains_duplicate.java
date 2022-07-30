import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hash_Set = new HashSet<Integer>();
        for(int i:nums){
         hash_Set.add(i);   
        }
       return hash_Set.size() != nums.length;
    }
}
