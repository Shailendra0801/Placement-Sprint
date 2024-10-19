class Solution {
    // public char findKthBit(int n, int k) {
    //     if(k == 0)
    //         return '0';
    //     StringBuilder s = new StringBuilder();
    //     s.append('0');
    //     for(int i = 1; i < n; i++){
    //         StringBuilder str = new StringBuilder();
    //         for(int j = 0; j < s.length(); j++){
    //             if(s.charAt(j) == '1')
    //                 str.append('0');
    //             else
    //                 str.append('1');
    //         }
    //         s.append('1');
    //         s.append(str.reverse());
    //         if(s.length() >= k)
    //             return s.charAt(k-1);
    //     }

    //     return '0';
    // }

    public char findKthBit(int n, int k) {
        int cc=solve(n,k);
        return cc==0?'0':'1';
    }
    public static int solve(int n,int k)
    {
        if(n==1||k==1)
        {
            return 0;
        }
        int len=(int)Math.pow(2,n)-1;
        int mid=((len)/2);
        if(mid==k-1)
        {
            return 1;
        }
        if(k-1<mid)
        {
            return solve(n-1,k);
        }
        else
        {
            return solve(n-1,len-k+1)==1?0:1;
        }
    }
}