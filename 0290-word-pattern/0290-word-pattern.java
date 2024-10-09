class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] cmp = s.split(" ");
        if(pattern.length() != cmp.length)
            return false;
        
        Map<Character, String> mp = new HashMap<>();
        // Map<String, Character> mps = new HashMap<>();
        for(int i = 0; i < cmp.length; i++){
            if(mp.containsKey(pattern.charAt(i))){
                if(!mp.get(pattern.charAt(i)).equals(cmp[i]))
                    return false;
            }
            else{
                // if(mps.containsKey(cmp[i]))
                //     return false;
                if(mp.containsValue(cmp[i]))
                    return false;
            }

            mp.put(pattern.charAt(i), cmp[i]);
            // mps.put(cmp[i], pattern.charAt(i));
        }

        return true;
    }
}