class Solution {
    public boolean canDistribute(int n, int[] quantities, int x) {
        int j = 0;
        int rem = quantities[j];

        for(int i = 0; i < n; i++){
            if(rem <= x){
                j++;
                if(j == quantities.length)
                    return true;
                else
                    rem = quantities[j];
            }
            else
                rem -= x;
        }
        return false;
    }

    public int minimizedMaximum(int n, int[] quantities){
        int l = 0, r = 0;

        for(int quantity : quantities){
            r = Math.max(r, quantity);
        }

        while(l < r){
            int mid = (l + r)/2;
            if(canDistribute(n, quantities, mid))
                r = mid;
            else
                l = mid+1;
        }
        return l;
    }
}