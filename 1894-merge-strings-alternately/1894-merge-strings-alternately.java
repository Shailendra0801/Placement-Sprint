class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;
        while(j < word1.length() && j < word2.length()){
            ans.insert(i++, word1.charAt(j));
            ans.insert(i++, word2.charAt(j));
            j++;
        }
        while(j < word1.length()){
            ans.insert(i++, word1.charAt(j));
            j++;
        }
        while(j < word2.length()){
            ans.insert(i++, word2.charAt(j));
            j++;
        }

        return ans.toString();
    }
}