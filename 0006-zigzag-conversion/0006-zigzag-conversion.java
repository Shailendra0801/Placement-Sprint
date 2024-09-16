class Solution {
    public String convert(String s, int n) {
        if (n == 1 || s.length() <= n) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            rows[i] = new StringBuilder();
        }

        int curr = 0;
        boolean dwn = false;

        for (char c : s.toCharArray()) {
            rows[curr].append(c);

            if (curr == 0 || curr == n - 1) {
                dwn = !dwn;
            }

            curr += dwn ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }

        return res.toString();
    }
}