class MyCalendar {
    private TreeMap<Integer, Integer> calander;
    public MyCalendar() {
        calander = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer pStart = calander.floorKey(start);
        Integer nStart = calander.ceilingKey(start);
        if(pStart != null && calander.get(pStart) > start)
            return false;
        if(nStart != null && nStart < end)
            return false;
        calander.put(start, end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */