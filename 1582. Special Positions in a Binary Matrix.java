class Solution {
    public int numSpecial(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        
        int[] rowCount = new int[m];
        int[] colCount = new int[n];
        
        // Step 1: Count 1s in rows & columns
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        
        int count = 0;
        
        // Step 2: Find special positions
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
