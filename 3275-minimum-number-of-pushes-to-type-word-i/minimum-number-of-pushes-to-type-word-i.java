class Solution {
    public int minimumPushes(String word) {
         int n = word.length();
        int pushes = 0;
        int position = 1; // current round/position (1st push, 2nd push, etc.)
        int count = 0;    // total letters processed so far
        
        while (count < n) {
            int lettersInThisRound = Math.min(8, n - count);
            pushes += position * lettersInThisRound;
            count += lettersInThisRound;
            position++;
        }
        
        return pushes;
    }
}