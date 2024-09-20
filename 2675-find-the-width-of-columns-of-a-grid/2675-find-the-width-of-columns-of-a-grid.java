class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j = 0; j < grid[0].length; j++){
            for(int i = 0; i < grid.length; i++){
                String str = String.valueOf(grid[i][j]);
                max = Math.max(max, str.length());
            }
            ans.add(max);
            max = 0;
        }

        int[] nAns = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            nAns[i] = ans.get(i);
        }

        return nAns;
    }
}