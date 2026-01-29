public class Solution {
    public int numIslands(char[][] grid) {
        /**
         * get the current row and column values
         */
        int row = grid.length;
        int column = grid[0].length;
        int island = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    island++;
                    dfs(i, j, grid);
                }
            }
        }
        return island;

    }

    private void dfs(int row, int column, char[][] grid) {
         int newRow = grid.length;
         int newColumn = grid[0].length;
        
         int[][] directions=new int[][]{
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}                    
         };
         /**
          * check if the rows and columns are out of bound or not?
          * The current value we are at, inside the grid, if that is already ZERO
         
          *  */
         if (row < 0 || column < 0 || row >= newRow || column >= newColumn || grid[row][column] == '0') {
             //terminating case
             return;

         }
         /**
          * Update the cell so that it does not mess with subsequent calculations
          */
         grid[row][column] = '0';
         for (int[] dir : directions) {
            dfs(row+dir[0], column+dir[1], grid);
        }
        
    }

}
