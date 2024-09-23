/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* productExceptSelf(int* nums, int N, int* resultSize){
    *resultSize = N;
    int *result = malloc(sizeof(int) * N);
    for(int i = 0, p = 1; i < N; i++){
        result[i] = p;
        p *= nums[i];
    }
    for(int i = N-1, p = 1; i >- 1; i--){
        result[i] *= p;
        p *= nums[i];
    }
    return result;
}