public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");/**
                                            * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
                                            
                                            An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
                                            
                                            
                                            
                                            Example 1:
                                            
                                            Input: grid = [
                                            ["1","1","1","1","0"],
                                            ["1","1","0","1","0"],
                                            ["1","1","0","0","0"],
                                            ["0","0","0","0","0"]
                                            ]
                                            Output: 1
                                            Example 2:
                                            
                                            Input: grid = [
                                            ["1","1","0","0","0"],
                                            ["1","1","0","0","0"],
                                            ["0","0","1","0","0"],
                                            ["0","0","0","1","1"]
                                            ]
                                            Output: 3
                                            
                                            */
        char[][] grid = {
            {'1', '0', '0', '1'},
            {'0', '0', '0', '0'},
            {'1', '0', '1', '1'}
        };

        Solution solution = new Solution();
        int result = solution.numIslands(grid);
        System.out.println("For the grid given above, the number of islands found are: "+result);

    }
}
