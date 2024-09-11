class Solution {
public:
    int minFlips(int a, int b, int c) {
        int ans = 0;

        bitset<32> A(a), B(b), C(c);

        for(int i = 0; i < 32; i++)
        {
            if((A[i] || B[i]) != C[i])
            {
                if(!C[i])
                    ans += A[i] + B[i];
                else 
                    ans += 1;
            }
        }

        return ans;
    }
};