class Solution {
public:
    int chalkReplacer(vector<int>& chalk, int k) {
        int i = 0;
        int n = chalk.size();
        long long int x = 0;
        for(int j = 0; j < n; j++){
            x += chalk[j];
        }
        k = k%x;
        while(k>=0){
            if(k < chalk[i%n]){
                return i%n;
            }
            k -= chalk[i%n];
            i++;
        }
        return 0;
    }
};