class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        
        int n=nums.size();
        int maxi=*max_element(nums.begin(),nums.end());
        int ans=1;
        int i=0;
        
        while(i<n)
        {   if(nums[i]==maxi)
        {

        
            int count=0;
            while(i<n && nums[i]==maxi)
            {
                ++count;
                i++;
            }
            ans=max(ans,count);
        }
        else
        {
            i++;
        }
        }
        return ans;


    }
};