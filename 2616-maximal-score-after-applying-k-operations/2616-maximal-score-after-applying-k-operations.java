class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(nums.length, (a, b) -> b - a);
        long ans = 0;
        for(int i : nums)
            heap.add(i);
        while(k > 0){
            int x = heap.poll();
            ans += (long) x;
            x = (int) Math.ceil(x / 3.0);
            heap.add(x);
            k--;
        }
        return ans;
    }
}