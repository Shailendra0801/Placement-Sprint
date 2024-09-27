class MyCalendarTwo {
    private TreeMap<Integer, Integer> calander;
    public MyCalendarTwo() {
        calander = new TreeMap();
    }
    
    public boolean book(int start, int end) {
        calander.put(start, calander.getOrDefault(start, 0)+1);
        calander.put(end, calander.getOrDefault(end, 0)-1);
        int count = 0;
        for(int a : calander.values()){
            count += a;
            if(count >= 3){
                calander.put(start, calander.get(start)-1);
                if(calander.get(start) == 0)
                    calander.remove(start);
                calander.put(end, calander.get(end)+1);
                if(calander.get(end) == 0)
                    calander.remove(end);
                
                return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */