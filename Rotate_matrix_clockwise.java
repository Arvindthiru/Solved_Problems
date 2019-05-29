class Solution {
    public void rotate(int[][] matrix) {
        int i,j,n,t;
        //t=0;
        n = matrix.length;
        for(i=0;i<n/2;i++)
        {
            for(j=i;j<n-i-1;j++)
            {
                t = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = t;
            }
        }
        
        
    }
}
