class Solution {
    int count;
    boolean[][] vis = new boolean[300][300];
    int[] posX = {1, -1, 0, 0};
    int[] posY = {0, 0, 1, -1};
    Queue<String> list = new LinkedList<>();
    
    public int numIslands(char[][] grid) {
        for(int i=0; i<grid.length; i++) {
            for (int j = 0; j<grid[i].length; j++) {
                findIslands(grid, i, j);   
            }
        }
        return count;
    }
    
    public void findIslands(char[][] grid, int x, int y) {
        if (grid[x][y] == '0' || vis[x][y]) return;

        list.add(x + " " + y);
        vis[x][y] = true;
        
        while(!list.isEmpty()) {
            String[] str = list.poll().split(" ");
            int tX = Integer.parseInt(str[0]);
            int tY = Integer.parseInt(str[1]);
            for (int i=0; i<4; i++) {
                int nX = tX + posX[i];
                int nY = tY + posY[i];
                if(nX < 0 || nX >= grid.length || nY < 0 || nY >= grid[0].length || vis[nX][nY] || grid[nX][nY] == '0') continue;
                list.add(nX + " " + nY);
                vis[nX][nY] = true;
            }
        }
        count++;
    }
}