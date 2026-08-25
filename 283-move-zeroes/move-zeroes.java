class Solution {
    public void moveZeroes(int[] nums) {
        
        int nonzero=0,zero=0;
        while(nonzero<nums.length){
            if(nums[nonzero]!=0){
                int temp=nums[nonzero];
                nums[nonzero]=nums[zero];
                nums[zero]=temp;
                nonzero++;
                zero++;
            }
            else{
                nonzero++;
            }
        }
    }
}