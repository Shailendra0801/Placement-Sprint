class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0|| nums.length ==1)
            return false;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }

        for(int x : mp.keySet()){
            if(mp.get(x) >= 2){
                return true;
            }
        }
        return false;
    }
}