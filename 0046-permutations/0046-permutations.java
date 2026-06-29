class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        solve(nums,vis,new ArrayList<>(),ans);
        return ans;
    }

    private void solve(int[] nums, boolean[] vis, List<Integer> curr, List<List<Integer>> ans){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(vis[i])
            continue;

            vis[i] = true;
            curr.add(nums[i]);

            solve(nums,vis,curr,ans);
            curr.remove(curr.size()-1);
            vis[i] = false;
        }
    }
}