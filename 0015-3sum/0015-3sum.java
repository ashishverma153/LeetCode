class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int k = nums[i];
            int low = i+1;
            int end = nums.length-1;
            while(low<end){
                if(nums[low]+nums[end]==(-k)){
                    ans.add(Arrays.asList(nums[low],nums[end],nums[i]));
                
                while (low < end && nums[low] == nums[low + 1]) low++;
                while (low < end && nums[end] == nums[end - 1]) end--;

                low++;
                end--;

                }else if(nums[low]+nums[end]<(-k)){
                    low++;
                }else{
                    end--;
                }
            }
        }
        return ans;
    }
}