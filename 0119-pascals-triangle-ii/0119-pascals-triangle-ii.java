class Solution {
    public List<Integer> getRow(int n) {
        List<List<Integer>> lst = new ArrayList<>();
        for(int i = 0; i < n+1; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if( j == 0 || j == i)
                    row.add(1);
                else{
                    int val = lst.get(i-1).get(j-1) +lst.get(i-1).get(j);
                    row.add(val);
                }
            }
            lst.add(row);
        }

        return lst.get(n);
    }
}