class RandomizedSet {
    private List<Integer> lst;
    private Map<Integer, Integer> mp;
    private Random random;
    public RandomizedSet() {
        lst = new ArrayList<>();
        mp = new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(!mp.containsKey(val)){
            mp.put(val, lst.size()); 
            lst.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if (mp.containsKey(val)) {
            int index = mp.get(val);
            int lastElement = lst.get(lst.size() - 1);
            lst.set(index, lastElement);
            mp.put(lastElement, index); 
            lst.remove(lst.size() - 1);
            mp.remove(val); 
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return lst.get(random.nextInt(lst.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */