class Solution {
    public int maxArea(int[] height) {
      int left = 1;
      int right = height.length;
      int res = 0;
      while(left != right){
        int nowHeight = Math.min(height[left-1],height[right-1]);
        int box = nowHeight*(right-left);
        res = Math.max(res,box);
        if(height[left-1] >= height[right-1]){
          right--;
        }
        else{
          left++;
        }
      }
      return res;
    }
}