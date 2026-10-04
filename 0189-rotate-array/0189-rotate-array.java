class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;;
        reverse(nums,0,n-1); // reverse pura array
        reverse(nums,0,k-1); // reverse till k
        reverse(nums,k,n-1); // reverse after k till n

    }
    void reverse(int[] nums,int left, int right)
        {
            while(left<right)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }
}