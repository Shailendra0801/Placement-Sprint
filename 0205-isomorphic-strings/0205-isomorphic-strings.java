class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character, Character> mps = new HashMap<>();
        Map<Character, Character> mpt = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char S = s.charAt(i);
            char T = t.charAt(i);
            if(mps.containsKey(S)){
                if(mps.get(S) != T)
                    return false;
            }
            else{
                if(mpt.containsKey(T))
                    return false;
            }
            mps.put(S, T);
            mpt.put(T, S);
        }

        return true;
    }
}