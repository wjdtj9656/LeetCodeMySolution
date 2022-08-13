import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        boolean flag = false;
        for(int i=0; i<nums.length; i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
            if(hs.get(nums[i])>1){
                flag = true;
                break;
            }
        }
        if(flag) return true;
        return false;
    }
}