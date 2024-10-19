class Solution {
    public int firstUniqChar(String s) {
        // Approach 1
        // Map<Character, Integer> mp = new HashMap<>();
        // for(char ch : s.toCharArray()){
        //     mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        // }
        // for(int i = 0; i < s.length(); i++){
        //     if(mp.get(s.charAt(i)) == 1)
        //         return i;
        // }
        // return -1;

        // Approach 2
        int[] count = new int[26];
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            ++count[a[i] - 97];
        }
        for (int i = 0; i < a.length; i++) {
            if(count[a[i]-97] == 1){
                return i;
            }
        }
        return -1;
    }
}