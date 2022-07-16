class Solution {
  static int cnt;
  static boolean res;
    public void isHappy(String s){
      int sum = 0;
      if(cnt>500) return;
      for(int i=0; i<s.length(); i++){
        sum += Math.pow((s.charAt(i) - '0'),2);
      }
      if(sum == 1){
        res = true;
        return;
      }
      else{
        String now = String.valueOf(sum);
        cnt++;
        isHappy(now);
        return;
      }
    }
    public boolean isHappy(int n) {
        String s = String.valueOf(n);
      res = false;
      cnt = 0;
      isHappy(s);
      return res;
    }
}