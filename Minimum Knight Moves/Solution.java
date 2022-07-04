class Solution {
  static int dx[]={2,-2,-2,2,1,1,-1,-1};
  static int dy[]={1,-1,1,-1,2,-2,2,-2,};
    public int minKnightMoves(int x, int y) {
      Queue<int[]> q = new LinkedList<>();
      q.add(new int[]{0,0,1});
      boolean visit[][] = new boolean[601][601];
      if(x==0 && y==0) return 0;
      while(!q.isEmpty()){
        int cur[] = q.poll();
        int cx = cur[0];
        int cy = cur[1];
        int cc = cur[2];
        
        for(int i=0; i<8; i++){
          int nx = cx + dx[i];
          int ny = cy + dy[i];
          if(visit[nx+300][ny+300]) continue;
          if(nx == x && ny == y){
            return cc;
          }
          else{
            q.add(new int[]{nx,ny,cc+1});
            visit[nx+300][ny+300] = true;
          }
        }
      }
      return 0;
    }
}