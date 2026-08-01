class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //first approach
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<numbers.length;i++)
        {
            int counterpart = target - numbers[i];
            if(map.containsKey(counterpart))
            {
                return new int[] {map.get(counterpart)+1,i+1};
            }
            map.put(numbers[i],i);
        }
        return new int[] {};
    }
}