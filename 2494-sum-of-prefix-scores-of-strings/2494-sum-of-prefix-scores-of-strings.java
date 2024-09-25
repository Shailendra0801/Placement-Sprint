class Solution {
    private class trie{
        trie[] child = new trie[26];
        int count = 0;
    }
    private void createTrie(String s, trie node){
        int n = s.length();
        for(int i = 0; i < n; i++){
            int idx = s.charAt(i) - 'a';
            if(node.child[idx] == null){
                node.child[idx] = new trie();
            }
            node = node.child[idx];
            node.count += 1;
        }
    }

    private int getPrefixScore(String s, trie node){
        int res = 0;
        trie cur = node;
        for(int i = 0; i <s.length(); i++){
            int idx = s.charAt(i) - 'a';
            cur = cur.child[idx];
            res += cur.count;
        }
        return res;
    }
    public int[] sumPrefixScores(String[] words) {
        int n = words.length;
        int[] ans = new int[n];
        if(n == 0)
            return ans;
        trie node = new trie();
        for(String ch : words){
            createTrie(ch, node);
        }

        for(int i = 0; i < n; i++){
           ans[i] = getPrefixScore(words[i], node);
        }
        
        return ans;
    }
}