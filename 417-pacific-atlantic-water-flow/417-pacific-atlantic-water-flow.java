class Node {
    public int x, y;
    Node (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int[] xP = {1, -1, 0, 0};
    int[] yP = {0, 0, 1, -1};
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                find(i, j, heights);
            }
        }
        return result;
    }
    
    public void find(int x, int y, int[][] heights) {
        boolean[][] visited = new boolean[heights.length][heights[0].length];
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y));
        visited[x][y] = true;
        boolean isP = false;
        boolean isA = false;
        
        while(!q.isEmpty()) {
            Node t = q.poll();
            for (int i = 0; i < 4; i++) {
                int nX = t.x + xP[i];
                int nY = t.y + yP[i];
                
                if (nX < 0 || nY < 0) {
                    isP = true;
                } 
                
                if (nX >= heights.length || nY >= heights[0].length) {
                    isA = true;
                }
                
                if (nX < 0 || nY < 0 || nX >= heights.length || nY >= heights[0].length
                     || heights[nX][nY] > heights[t.x][t.y] || visited[nX][nY]) {
                    continue;
                }
                
                q.add(new Node(nX, nY));
                visited[nX][nY] = true;
            }
        }
        
        if (isP && isA) {
            List<Integer> list = new ArrayList<>();
            list.add(x);
            list.add(y);
            result.add(list);
        }
    }
}
