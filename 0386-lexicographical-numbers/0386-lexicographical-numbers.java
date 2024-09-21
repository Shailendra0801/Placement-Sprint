class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        int x = 1;
        for(int i = 0; i < n; i++){
            ans.add(x);
            if(x*10 <= n)
                x *= 10;
            else{
                while(x%10 == 9 || x+1 > n){
                    x /= 10;
                }
                x++;
            }
            
        }
        return ans;
    }
}

// public class Solution {
//     public List<Integer> lexicalOrder(int n) {
//         List<Integer> lexicographicalNumbers = new ArrayList<>();
//         for (int start = 1; start <= 9; ++start) {
//             generateLexicalNumbers(start, n, lexicographicalNumbers);
//         }
//         return lexicographicalNumbers;
//     }
//     private void generateLexicalNumbers(
//         int currentNumber,
//         int limit,
//         List<Integer> result
//     ) {
//         if (currentNumber > limit) return;
//         result.add(currentNumber);
//         for (int nextDigit = 0; nextDigit <= 9; ++nextDigit) {
//             int nextNumber = currentNumber * 10 + nextDigit;
//             if (nextNumber <= limit) {
//                 generateLexicalNumbers(nextNumber, limit, result);
//             } else {
//                 break; 
//             }
//         }
//     }
// }