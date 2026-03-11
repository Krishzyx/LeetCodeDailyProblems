class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        StringBuilder res = new StringBuilder();

        for(char c : bin.toCharArray()){
            if(c == '0') res.append('1');
            else res.append('0');
        }

        return Integer.parseInt(res.toString(),2);
    }
}
