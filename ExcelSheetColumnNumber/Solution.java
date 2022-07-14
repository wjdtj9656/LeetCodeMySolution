class Solution {
    public int titleToNumber(String columnTitle) {
      StringBuilder sb = new StringBuilder(columnTitle);
      sb.reverse();
      int result = 0;
      for(int i=0; i<sb.length(); i++){
        result += (sb.charAt(i) - 64) * (Math.pow(26,i));
      }
      return result;
    }
}