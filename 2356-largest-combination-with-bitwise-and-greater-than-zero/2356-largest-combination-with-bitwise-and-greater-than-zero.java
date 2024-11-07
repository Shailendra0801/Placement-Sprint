class Solution {
    public int largestCombination(int[] arr) {
        // if(arr.length == 0)
        //     return 0;
        // if(arr.length == 1)
        //     return arr[0];
        int res = 0;
        int bMask = 1;
        for(int i = 0; i < 32; i++){
            int count = 0;
            for(int n : arr){
                if((n & bMask) != 0)
                    count++;
            }
            bMask <<= 1;
            res = Math.max(res, count);
        }

        return res;
    }
}