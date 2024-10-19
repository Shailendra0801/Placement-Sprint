class Solution {
    public char findKthBit(int n, int k) {
        if(k == 0)
            return '0';
        StringBuilder s = new StringBuilder();
        s.append('0');
        for(int i = 1; i < n; i++){
            StringBuilder str = new StringBuilder();
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == '1')
                    str.append('0');
                else
                    str.append('1');
            }
            s.append('1');
            s.append(str.reverse());
            if(s.length() >= k)
                return s.charAt(k-1);
        }

        return '0';
    }
}