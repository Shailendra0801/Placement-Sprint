class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       int[] freq = new int[26];
       int[] windowFreq = new int[26];
       List<Integer> ans = new ArrayList<>();
       if(p.length() > s.length())
            return ans;
        for(int i = 0; i < p.length(); i++){
            freq[p.charAt(i) - 'a']++;
            windowFreq[s.charAt(i) - 'a']++;
        }

        for(int i = p.length(); i < s.length(); i++){
            if(matches(freq, windowFreq))
                ans.add(i - p.length());
            windowFreq[s.charAt(i) - 'a']++;
            windowFreq[s.charAt(i - p.length()) - 'a']--;
        }
        if(matches(freq, windowFreq))
            ans.add(s.length() - p.length());

        return ans;
    }

    private boolean matches(int[] freqA, int[] freqB){
        for(int i = 0; i < 26; i++){
            if(freqA[i] != freqB[i])
                return false;
        }
        return true;
    }
        
}