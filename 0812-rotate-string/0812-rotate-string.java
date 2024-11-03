class Solution {
    public boolean rotateString(String s, String k) {
        if(s.length() != k.length())
            return false;

        String mix = s + s;
        if(mix.contains(k))
            return true;
        return false;
    }
}