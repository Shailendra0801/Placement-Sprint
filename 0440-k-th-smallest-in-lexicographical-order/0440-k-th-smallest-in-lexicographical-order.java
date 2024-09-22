class Solution {
    private int size(int n, long a, long b){
        int size = 0;
        while(a <= n){
            size += Math.min((long)n+1, b)-a;
            a *= 10;
            b *= 10;
        }
        return size;
    }

    public int findKthNumber(int n, int k) {
        int curr = 1;
        k -= 1;
        while(k > 0){
            int no = size(n, curr, curr+1);
            if(no <= k){
                curr += 1;
                k -= no;
            }
            else{
                curr *= 10;
                k -= 1;
            }

        }

        return curr;
    }
}