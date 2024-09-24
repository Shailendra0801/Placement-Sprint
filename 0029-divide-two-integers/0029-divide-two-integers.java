class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1) 
            return 2147483647; 
        if(divisor == -1 && divisor == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        if(Math.abs(divisor) == 1)
            return dividend*divisor;

        boolean sign = (dividend < 0)^(divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        
        int ans = 0;

        while(a >= b){
            long temp = b;
            long mul = 1;

            while((a >> 1) >= temp){
                temp <<= 1;
                mul <<= 1;
            }

            a -= temp;
            ans += mul;
        }

        return sign? -ans : ans;
        
    }
}