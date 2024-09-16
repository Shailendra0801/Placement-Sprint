class Solution {
    public static int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int minDiff = Integer.MAX_VALUE;
        int firstTimeInMinutes = convertToMinutes(timePoints.get(0));
        int prevTimeInMinutes = firstTimeInMinutes;
        
        for (int i = 1; i < timePoints.size(); i++) {
            int currentTimeInMinutes = convertToMinutes(timePoints.get(i));
            minDiff = Math.min(minDiff, currentTimeInMinutes - prevTimeInMinutes);
            prevTimeInMinutes = currentTimeInMinutes;
        }
        
        minDiff = Math.min(minDiff, (firstTimeInMinutes + 1440) - prevTimeInMinutes);
        
        return minDiff;
    }

    private static int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}