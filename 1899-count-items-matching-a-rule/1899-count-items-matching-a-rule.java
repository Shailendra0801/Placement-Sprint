class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int x = -1;
        int ans = 0;
        if (ruleKey.equals("type")) {
            x = 0;
        } 
        else if (ruleKey.equals("color")) {
            x = 1;
        } 
        else if (ruleKey.equals("name")) {
            x = 2;
        }
        for(List<String> item : items){
            if(ruleValue.equals(item.get(x)))
                ans++;
        }
        return ans;
    }
}