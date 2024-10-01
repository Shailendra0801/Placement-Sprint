class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int[] arr1 = new int[k];
        for(int i : arr){
            int rem = ((i%k)+k)%k;
            arr1[rem]++;
        }
        for(int i = 1; i < k; i++){
            if(arr1[i] != arr1[k-i])
                return false;
        }
        if(arr1[0]%2 != 0)
            return false;

        return true;
    }
}