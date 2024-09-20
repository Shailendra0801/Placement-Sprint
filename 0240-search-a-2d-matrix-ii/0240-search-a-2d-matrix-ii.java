// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         for(int i = 0; i < matrix.length; i++){
//             if(getAns(matrix[i], target))
//                 return true;
//         }
//         return false;
//     }
//     private boolean getAns(int[] arr, int t){
//         int l = 0;
//         int r = arr.length-1;
//         while(l <= r){
//             int mid = l + (r-l)/2;
//             if(arr[mid] == t)
//                 return true;
//             else if(arr[mid] < t)
//                 l = mid+1;
//             else
//                 r = mid-1;
//         }
//         return false;
//     }
// }

class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
     {
        int row=0;
        int col=matrix[0].length-1;

        while(row<=matrix.length-1 && col>=0)
        {
            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(target<matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return false;
    }
}