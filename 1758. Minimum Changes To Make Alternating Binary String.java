class Solution {
    public int minOperations(String s) {
        int countStartWith0 = 0;
        int countStartWith1 = 0;

      for(int i=0; i<s.length(); i++){

        char current = s.charAt(i);
        int expectedIfStartWith0 = ((i % 2 == 0) ? '0' : '1');
        int expectedIfStartWith1 = ((i % 2 == 0)  ? '1' : '0');

        if(current != expectedIfStartWith0){
            countStartWith0++;
        }
        if(current != expectedIfStartWith1){
            countStartWith1++;
        }
      }
      return Math.min(countStartWith0,countStartWith1);

    }
}
