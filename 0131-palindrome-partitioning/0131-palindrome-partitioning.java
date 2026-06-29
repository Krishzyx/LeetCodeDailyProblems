class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solve(0,s,new ArrayList<>(),ans);
        return ans;
    }
    private void solve(int idx,String s, List<String>curr,List<List<String>> ans){
       if(idx == s.length()){
        ans.add(new ArrayList<>(curr));
        return;
       }

       for(int i=idx; i<s.length(); i++){
        if(isPallindrome(s,idx,i)){
            curr.add(s.substring(idx,i+1));
            solve(i+1,s,curr,ans);
            curr.remove(curr.size()-1);
        }
       }
    }
    private boolean isPallindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left)!=s.charAt(right))
                return false;

                left++;
                right--;
            
        }
            return true;
    }
}
