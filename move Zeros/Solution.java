class Solution {
    public void moveZeroes(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        int zero = 0;
        for(int i : nums){
          if(i != 0)  list.add(i);
          else zero++;
        }
      for(int i=0; i<zero; i++){
        list.add(0);
      }
      for(int i=0; i<nums.length; i++){
        nums[i] = list.get(i);
      }
    }
}