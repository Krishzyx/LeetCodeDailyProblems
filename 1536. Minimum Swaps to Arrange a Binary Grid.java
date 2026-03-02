class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] tz = new int[n];  // trailing zeroes for each row

        // Step 1: count trailing zeroes for each row
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0) count++;
                else break;
            }
            tz[i] = count;
        }

        int swaps = 0;

        // Step 2: fix rows from top to bottom
        for (int i = 0; i < n; i++) {
            int required = n - 1 - i;
            int j = i;

            // find row with enough trailing zeroes
            while (j < n && tz[j] < required) {
                j++;
            }

            // if not found return -1
            if (j == n) return -1;

           
            while (j > i) {
                int temp = tz[j];
                tz[j] = tz[j - 1];
                tz[j - 1] = temp;
                swaps++;
                j--;
            }
        }

        return swaps;
    }
}
