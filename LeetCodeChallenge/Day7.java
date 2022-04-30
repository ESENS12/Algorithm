class Solution {
    int sr_length = 0;
    int sc_length = 0;
    int target_color = 0;
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        sr_length = image.length;
        sc_length = image[0].length;
        target_color = image[sr][sc];
        if(target_color == newColor){
            return image;
        }
        fillDirection(image,sr,sc,newColor);
        //printArray(image);
        return image;
    }
    
    public void fillDirection(int[][] image, int sr, int sc, int newColor){
        if(sr == sr_length || sc == sc_length || sr < 0 || sc < 0){
            return;
        }
        
        if(image[sr][sc] == target_color){
            image[sr][sc] = newColor;
        }else{
            return;
        }
        
        fillDirection(image, sr-1, sc, newColor);
        fillDirection(image, sr+1, sc, newColor);
        fillDirection(image, sr, sc-1, newColor);
        fillDirection(image, sr, sc+1, newColor);
    }
    public void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"");
            }
            System.out.println("");
        }
    }
}


class Solution {
    int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        int nResult = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    nResult = Math.max(nResult, bfs(grid, i, j));
                }
            }
        }
        return nResult;
    }
    
    public int bfs(int[][] grid, int col, int row){
        int nCnt = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{col,row});
        grid[col][row] = 0;
        
        while(!queue.isEmpty()){
            int[] nArr = queue.poll();
            for(int[] n : dir){
                int x = nArr[0] + n[0];
                int y = nArr[1] + n[1];
                if(x > -1 && x < grid.length && y > -1 && y < grid[0].length && grid[x][y] == 1){
                    grid[x][y] = 0;
                    nCnt++;
                    queue.offer(new int[]{x,y});
                }
            }
        }
        return nCnt;
    }
}
