class RandomizedCollection {
    private List<Integer> lst;
    private Map<Integer, Set<Integer>> mp;
    private Random rnd = new Random();
    public RandomizedCollection() {
        lst = new ArrayList<>();
        mp = new HashMap<>();
    }
    
    public boolean insert(int val) {
        boolean contains = !mp.containsKey(val);
        
        lst.add(val);

        mp.putIfAbsent(val, new HashSet<>());
        mp.get(val).add(lst.size()-1);

        return contains;
    }
    
    public boolean remove(int val) {
        if(!mp.containsKey(val))
            return false;
        else{
            Set<Integer> idx = mp.get(val);
            int rmIdx = idx.iterator().next();
            idx.remove(rmIdx);
            
            if(idx.isEmpty())
                mp.remove(val);

            int lstEle = lst.get(lst.size()-1);

            lst.set(rmIdx, lstEle);
            if(mp.containsKey(lstEle)){
                mp.get(lstEle).remove(lst.size()-1);
                mp.get(lstEle).add(rmIdx);
            }

            lst.remove(lst.size()-1);
            return true;
        }
    }
    
    public int getRandom() {
        return lst.get(rnd.nextInt(lst.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */