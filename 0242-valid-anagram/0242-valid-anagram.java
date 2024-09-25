class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for(char a : s.toCharArray()){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        for(char a : t.toCharArray()){
            map.put(a, map.getOrDefault(a, 0)-1);
        }
        for(int i : map.values()){
            if(i != 0)
                return false;
        }
        return true;
    }
}