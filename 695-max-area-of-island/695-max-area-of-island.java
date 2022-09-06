class Solution {
    int count;
    
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    count = 0;
                    dfs(i, j, grid);
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }
    
    public void dfs(int x, int y, int[][] grid) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != 1) return;
        
        grid[x][y] = -1;
        count++;
        
        dfs(x+1, y, grid);
        dfs(x-1, y, grid);
        dfs(x, y+1, grid);
        dfs(x, y-1, grid);
    }
}