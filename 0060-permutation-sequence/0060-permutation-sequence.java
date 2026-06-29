class Solution {
    String ans = "";
    int count = 0;

    public String getPermutation(int n, int k) {

        boolean[] vis = new boolean[n + 1];
        solve(n, k, "", vis);
        return ans;
    }

    public void solve(int n, int k, String curr, boolean[] vis) {
        if (curr.length() == n) {
            count++;
            if (count == k)
                ans = curr;
            return;

        }
        if (!ans.equals(""))
            return;
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                vis[i] = true;
                solve(n, k, curr + i, vis);
                vis[i] = false;
            }
        }
    }
}
