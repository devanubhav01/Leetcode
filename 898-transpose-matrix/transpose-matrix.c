#include <stdlib.h>

int** transpose(int** matrix, int matrixSize, int* matrixColSize, int* returnSize, int** returnColumnSizes) {
    
    int m = matrixSize;          // rows
    int n = matrixColSize[0];    // columns
    
    // Transposed matrix will have n rows
    *returnSize = n;
    
    // Allocate column sizes array
    *returnColumnSizes = (int*)malloc(n * sizeof(int));
    
    for(int i = 0; i < n; i++) {
        (*returnColumnSizes)[i] = m;
    }
    
    // Allocate result matrix
    int** result = (int**)malloc(n * sizeof(int*));
    
    for(int i = 0; i < n; i++) {
        result[i] = (int*)malloc(m * sizeof(int));
    }
    
    // Fill transpose
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            result[j][i] = matrix[i][j];
        }
    }
    
    return result;
}