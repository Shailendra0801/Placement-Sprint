class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;

        int i = 0;
        while(i < n){
            switch(s.charAt(i)){
                case 'I':{
                    if(i+1 < n && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'))   
                        ans -=1;
                    else
                        ans += 1;
                    break;
                }
                case 'V':{
                    ans += 5;
                    break;
                }
                case 'X':{
                    if(i+1 < n && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'))
                        ans -= 10;
                    else 
                        ans += 10;
                    break;
                }
                case 'L':{
                    ans += 50;
                    break;
                }
                case 'C':{
                    if(i+1 < n && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))
                        ans -= 100;
                    else 
                        ans += 100;
                    break;
                }
                case 'D':{
                    ans += 500;
                    break;
                }
                case 'M':{
                    ans += 1000;
                    break;
                }
                default:{
                    return -1;
                }

            }
            i++;
        }
        return ans;
    }
}
