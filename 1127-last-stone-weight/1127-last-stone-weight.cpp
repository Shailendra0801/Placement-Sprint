class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        priority_queue<int> pq;
        for(int i=0; i<stones.size(); i++){
            pq.push(stones[i]);
        }
        while(pq.size()>1){
            int first = pq.top();
            pq.pop();
            int second = pq.top();
            pq.pop();
            int x =first-second;
            if (x > 0) {
                pq.push(x);
            }
        }
        if(pq.size() > 0) return pq.top();
        else return 0;
    }
};