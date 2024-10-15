class Solution {
    public long minimumSteps(String s) {
        long ans = 0;
        // StringBuffer str = new StringBuffer(s);
        // int i = 0, j = str.length()-1;
        // while(i <= j){
        //     if(str.charAt(i) == '1' && str.charAt(j) == '0'){
        //         char temp = str.charAt(i);
        //         str.setCharAt(i, str.charAt(j));
        //         str.setCharAt(j, temp);
        //         ans += j-i;
        //     }
        //     else if(str.charAt(i) == '1' && str.charAt(j) != '0')
        //         i--;
        //     else if(str.charAt(i) != '1' && str.charAt(j) == '0')
        //         j++;

            
        //     i++;
        //     j--;
        // }
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                ans += i - j;
                j++;
            }
        }
        return ans;
    }
}