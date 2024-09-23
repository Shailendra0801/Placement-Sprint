class Solution {
    int[] t = new int[51];
    private int getAns(String s, Set<String> set, int i, int n){
        if(i >= n)
            return 0;
        int res = 1 + getAns(s, set, i+1, n);
        if(t[i] != -1)
            return t[i];
        for(int j = i; j < n; j++){
            String str = s.substring(i, j+1);
            if(set.contains(str)){
                res = Math.min(res, getAns(s, set, j+1, n));
            }
        }
        return t[i] = res;
    }

    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        Arrays.fill(t, -1);
        Set<String> set = new HashSet<>();
        for(int i = 0; i < dictionary.length; i++){
            set.add(dictionary[i]);
        }
        return getAns(s, set, 0, n);
    }
}