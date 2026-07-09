class Solution {
    public void sortColors(int[] nums) {
        int max =2;
        int[] maxsize = new int[max+1];

        for(int i=0;i<nums.length;i++){
            int value = nums[i];
            maxsize[value]++;
        }

        int index=0;
        for(int i=0;i<=max;i++){
            while(maxsize[i]>0){
                nums[index]=i;
                index++;
                maxsize[i]--;
            }
        }
    }
}