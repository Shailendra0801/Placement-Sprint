class Solution {
    private boolean match(int[][] arr, int[][] tar){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] != tar[i][j])
                    return false;
            }
        }
        return true;
    }

    public boolean findRotation(int[][] matrix, int[][] target) {
        int num = 4;
        while(num > 0){
            for(int i = 0; i < matrix.length; i++){
                for(int j = i; j < matrix[0].length; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            for(int i = 0; i < matrix.length; i++){
                int left = 0;
                int right = matrix[0].length-1;
                while(left < right){
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                    left++;
                    right--;
                }
            }
            num--;
            if(match(matrix, target))
                return true;
        }
        return false;
        
    }
}
