class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> wc = new HashMap<>();

        for(String w : s1.split(" ")){
            wc.put(w, wc.getOrDefault(w, 0)+1);
        }
        for(String w : s2.split(" ")){
            wc.put(w, wc.getOrDefault(w, 0)+1);
        }

        List<String> res = new ArrayList<>();

        for(String w : wc.keySet()){
            if(wc.get(w) == 1){
                res.add(w);
            }
        }
        return res.toArray(new String[0]);
    }
}