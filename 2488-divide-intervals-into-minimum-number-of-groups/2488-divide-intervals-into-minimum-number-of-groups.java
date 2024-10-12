class Solution {
    public int minGroups(int[][] intervals) {
        List<int[]> events = new ArrayList<>();

        for (int[] interval : intervals) {
            events.add(new int[]{interval[0], 1}); 
            events.add(new int[]{interval[1] + 1, -1}); 
        }

        events.sort((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        int maxGroups = 0;
        int currentGroups = 0;

        for (int[] event : events) {
            currentGroups += event[1];
            maxGroups = Math.max(maxGroups, currentGroups);
        }

        return maxGroups;
    }
}