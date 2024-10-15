class Solution {
    // public int[] countBits(int n) {
    //     int[] ans = new int[n+1];
    //     for(int i = 0; i <= n; i++){
    //         ans[i] = getBits(i);
    //     }
    //     return ans;
    // }
    // private int getBits(int n){
    //     int res = 0;
    //     while(n > 0){
    //         if(n%2 == 1)
    //             res++;
    //         n /= 2;
    //     }
    //     return res;
    // }

     public int[] countBits(int n) {
        int[] a=new int[n+1];
        a[0]=0;
        for(int i=1;i<n+1;i++){
            a[i]=a[i-1]+1;
            int t=i;
            while(t%2==0){
                a[i]--;
                t/=2;
            }
        }
        return a;
    }
}