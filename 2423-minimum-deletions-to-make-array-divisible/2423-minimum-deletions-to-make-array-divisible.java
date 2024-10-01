class Solution {
    public int gcd(int a, int b)
    {
       if(a==0)return b;
       return gcd(b%a, a);
    }
    public int minOperations(int[] nums, int[] div) {
        int tmp = div[0];
        for(int i = 1; i < div.length; i++)
        {
            tmp = gcd(tmp, div[i]);
        }
        Arrays.sort(nums);
        for( int i = 0; i < nums.length; i++)
        {
            if(tmp%nums[i] == 0)
            {
                return i;
            }
        }
        
        return -1;
    }
}