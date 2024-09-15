class Solution {
    public int findTheLongestSubstring(String s) {
        int[] mapp = new int[32];
        Arrays.fill(mapp, -2);
        mapp[0] = -1;

        int len = 0;
        int mask = 0;

        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);

            switch (chr) {
                case 'a':
                    mask ^= 1;
                    break;
                case 'e':
                    mask ^= 2;
                    break;
                case 'i':
                    mask ^= 4;
                    break;
                case 'o':
                    mask ^= 8;
                    break;
                case 'u':
                    mask ^= 16;
                    break;
            }

            int prev = mapp[mask];
            if (prev == -2) {
                mapp[mask] = i;
            } else {
                len = Math.max(len, i - prev);
            }
        }

        return len;
    }
}