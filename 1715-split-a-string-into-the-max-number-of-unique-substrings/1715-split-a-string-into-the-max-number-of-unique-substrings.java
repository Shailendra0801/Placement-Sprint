class Solution {
    public int maxUniqueSplit(String s) {
        Set<String> set = new HashSet<>();

        return getAns(s, 0, set);
    }
    private int getAns(String s, int i, Set<String> set){
        if(i == s.length())
            return 0;
        int ans = 0;
        for(int j = i+1; j <= s.length(); j++){
            String subStr = s.substring(i, j);
            if(!set.contains(subStr)){
                set.add(subStr);
                ans = Math.max(ans, 1 + getAns(s, j, set));
                set.remove(subStr);
            }
        }

        return ans;
    }
}