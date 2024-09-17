class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> wc = new HashMap<>(), wcc = new HashMap<>();
        String str = String.join(" ", words1);
        String strr = String.join(" ", words2);

        for(String w : str.split(" ")){
            wc.put(w, wc.getOrDefault(w, 0)+1);
        }
        for(String w : strr.split(" ")){
            wcc.put(w, wcc.getOrDefault(w, 0)+1);
        }

        int ans = 0;

        for(String w : words1){
            if(wc.get(w) == 1 && wcc.getOrDefault(w, 0) == 1){
                ans += 1;
            }
        }

        return ans;
    }
}