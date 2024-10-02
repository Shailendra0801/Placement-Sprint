class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] dummy = arr.clone();
        Arrays.sort(dummy);
        Map<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[n];
        int rnk = 1;

        for(int i = 0; i < n; i++){
            if(!mp.containsKey(dummy[i])){
                mp.put(dummy[i], rnk);
                rnk++;
            }
        }
        for(int i = 0; i < n; i++){
            ans[i] = mp.get(arr[i]);
        }

        return ans;
    }
}