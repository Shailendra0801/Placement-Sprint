class Solution {
    private class Trie{
        Trie[] child = new Trie[10];
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie node = new Trie();
        for(int i : arr1){
            int ph = msb(i);
            Trie cur = node;
            while(ph > 0){
                int val = (i/ph)%10;
                if(cur.child[val] == null){
                    cur.child[val] = new Trie();
                }
                cur = cur.child[val];
                ph /= 10;
            }
        }
        int max = 0;
        for(int i : arr2){
            int ph = msb(i);
            int curlen = 0;
            Trie cur = node;
            while(ph > 0){
                int val = (i/ph)%10;
                if(cur.child[val] == null){
                    break;
                }
                cur = cur.child[val];
                curlen++;
                max = Math.max(max, curlen);
                ph /= 10;
            }
        }
        return max;
        
    }
    private int msb(int n){
        int x = 1;
        while(x*10 <= n)
            x *= 10;
        return x;
    }
}