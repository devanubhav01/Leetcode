/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

// Helper: count total nodes in the tree
int countNodes(struct TreeNode* root) {
    if (root == NULL) return 0;
    return 1 + countNodes(root->left) + countNodes(root->right);
}

// Helper: fill array in postorder (left -> right -> root)
void postorderFill(struct TreeNode* root, int* arr, int* index) {
    if (root == NULL) return;
    postorderFill(root->left, arr, index);
    postorderFill(root->right, arr, index);
    arr[*index] = root->val;
    (*index)++;
}

int* postorderTraversal(struct TreeNode* root, int* returnSize) {
    int count = countNodes(root);
    int* result = (int*)malloc(count * sizeof(int));
    *returnSize = count;

    int index = 0;
    postorderFill(root, result, &index);

    return result;
}