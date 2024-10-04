class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i = 0, j = skill.length-1;
        long ans = 0;
        if(skill.length == 2)
            return skill[0]*skill[1];
        int skl = skill[0]+skill[skill.length-1];
        while(i < j){
            if(skill[i]+skill[j] != skl)
                return -1;
            else{
                ans += (long) (skill[i]*skill[j]);
            }
            i++;
            j--;
        }
        return ans;
    }
}