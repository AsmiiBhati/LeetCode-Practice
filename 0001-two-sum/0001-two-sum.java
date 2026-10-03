class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            int counterpart = target - nums[i];
            if(map.containsKey(counterpart))
            {
                return new int[] {map.get(counterpart),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}