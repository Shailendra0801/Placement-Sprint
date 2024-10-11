class Solution {
    public int smallestChair(int[][] times, int t) {
        int n = times.length;
        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(new int[]{times[i][0], 1, i});
            list.add(new int[]{times[i][1], -1, i});
        }
        list.sort((a, b) -> (a[0] == b[0]) ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> chairsAvailable = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            chairsAvailable.add(i);
        }

        int[] chair = new int[n];

        for(int[] event: list){
            int time = event[0];
            int type = event[1];
            int friend = event[2];

            if(type == 1){
                int chairs = chairsAvailable.poll();
                chair[friend] = chairs;

                if(friend == t)
                    return chairs;
            }
            else{
                chairsAvailable.add(chair[friend]);
            }
        }
        return -1;
    }
}