class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int row=0;
        int col=n-1;
        int result=0;
        while(row<m && col>=0){
            if(grid[row][col]<0){
                result += m-row;
                col--;
            }
            else{
                row++;
            }
        }
        return result;
    }
}