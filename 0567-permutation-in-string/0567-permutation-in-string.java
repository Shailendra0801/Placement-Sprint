class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;
       int[] freq = new int[26];
       int[] windowFreq = new int[26];
        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            windowFreq[s2.charAt(i) - 'a']++;
        }

        for(int i = s1.length(); i < s2.length(); i++){
            if(matches(freq, windowFreq))
                return true;
            windowFreq[s2.charAt(i) - 'a']++;
            windowFreq[s2.charAt(i - s1.length()) - 'a']--;
        }

        return matches(freq, windowFreq);
    }

    private boolean matches(int[] freqA, int[] freqB){
        for(int i = 0; i < 26; i++){
            if(freqA[i] != freqB[i])
                return false;
        }
        return true;
    }
}