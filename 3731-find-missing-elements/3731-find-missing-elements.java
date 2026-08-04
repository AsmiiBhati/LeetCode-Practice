class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length-1;
        for(int i = nums[0];i<nums[n];i++)
        {
            if(!set.contains(i)) result.add(i);
        }
        return result;
        
    }
}