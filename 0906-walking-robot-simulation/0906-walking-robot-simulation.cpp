class Solution {
public:
    int robotSim(vector<int>& commands, vector<vector<int>>& obstacles) {
        vector<pair<int, int>> dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int pt = 0;

        set<pair<int, int>> st;
        for(auto& i : obstacles){
            st.insert({i[0], i[1]});
        }

        int x=0, y=0, ans=0;
        for(int j : commands){
            if(j == -1)
                pt = (pt+1)%4;

            else if(j == -2)
                pt = (pt+3)%4;

            else{
                for(int k = 0; k < j; ++k){
                    int nx = x + dir[pt].first;
                    int ny = y + dir[pt].second;

                    if(st.find({nx, ny}) != st.end()){
                        break;
                    }

                    x = nx;
                    y = ny;

                    ans = max(ans, x*x+y*y);

                }
            }
        }

        return ans;

    }
};