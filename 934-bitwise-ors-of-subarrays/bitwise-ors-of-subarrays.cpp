class Solution {
public:
    int subarrayBitwiseORs(vector<int>& arr) {
        int n=arr.size();
        unordered_set<int>res,prev;
        for(int i=0;i<arr.size();i++)
        {
            unordered_set<int>temp;
            temp.insert(arr[i]);
            for(int itr:prev)
            {
                temp.insert(arr[i]|itr);
            }
            res.insert(temp.begin(),temp.end());
            prev=temp;
        }
        return (int)res.size();
    }
};