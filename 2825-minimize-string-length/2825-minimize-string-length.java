class Solution {
    public int minimizedStringLength(String s) {
        // Approach 1
        // Set<Character> set = new HashSet<>();
        // for(char ch : s.toCharArray()){
        //     set.add(ch);
        // }
        // return set.size();

        // Approach 2
        char[] chars=s.toCharArray();
        int[] counts=new int[26];
        int result=0;
        for(char c:chars)
        {
            counts[c-'a']++;
        }
        for(int i:counts)
        {
            if(i>0)
            {
                result++;
            }
        }
        return result;
    
    }
}