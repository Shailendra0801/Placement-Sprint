class Solution {

    private static HashMap<String, List<Integer>> store = new HashMap<>();

    public List<Integer> diffWaysToCompute(String ex) {
        if(store.containsKey(ex)){
            return store.get(ex);
        }

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < ex.length(); i++){
            char c = ex.charAt(i);

            if(c == '+' || c == '-' || c =='*'){
                List<Integer> left = diffWaysToCompute(ex.substring(0, i));
                List<Integer> right = diffWaysToCompute(ex.substring(i+1));

                for(int l : left){
                    for( int r : right){
                        if (c == '+') {
                            res.add(l + r);
                        } else if (c == '-') {
                            res.add(l - r);
                        } else if (c == '*') {
                            res.add(l * r);
                        }
                    }
                }
            }
            
        }
        if(res.isEmpty()){
            res.add(Integer.parseInt(ex));
        }

        store.put(ex, res);

        return res;
    }
}