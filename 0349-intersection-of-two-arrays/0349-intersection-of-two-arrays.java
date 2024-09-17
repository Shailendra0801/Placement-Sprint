class Solution {
    private boolean present(int k, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                return true;
            }
        }
        return false;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            if(present(nums1[i], nums2)){
                res.add(nums1[i]);
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int num : res) {
            set.add(num);
        }

        int[] ress = new int[set.size()];
        int i = 0;
        for(int w : set){
            ress[i++] = w;
        }
        return ress;
    }
}