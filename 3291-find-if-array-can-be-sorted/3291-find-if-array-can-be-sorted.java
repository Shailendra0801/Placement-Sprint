class Solution {
    public static boolean canSortArray(final int[] nums) {
        short pMax = 0, cMin = 0, cMax = 0;
        byte pCnt = 0;
        for (final int i : nums) {
            final byte ccnt = (byte)Integer.bitCount(i);
            if (pCnt == ccnt) {
                cMin = cMin > i ? (short)i : cMin;
                cMax = cMax < i ? (short)i : cMax;
            } else if (cMin < pMax) {
                return false;
            } else {
                pMax = cMax;
                cMin = cMax = (short)i;
                pCnt = ccnt;
            }
        }
        return cMin >= pMax;
    }
}