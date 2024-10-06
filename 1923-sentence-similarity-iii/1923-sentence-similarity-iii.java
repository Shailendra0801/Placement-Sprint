class Solution {
    public boolean areSentencesSimilar(String s, String r) {
        String[] str = s.split(" ");
        String[] str1 = r.split(" ");
        String[] shrt = str.length <= str1.length ? str: str1;
        String[] lng = str.length > str1.length ? str: str1;
        int i = 0, j = 0;
        while(i < shrt.length && shrt[i].equals(lng[i]))
            i++;
        while(j < shrt.length && shrt[shrt.length - 1 - j].equals(lng[lng.length - 1 - j]))
            j++;
        
        return i+j >= shrt.length;
    }
}