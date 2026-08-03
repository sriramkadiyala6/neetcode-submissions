class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 2) return new int[] {0, 1};

        //int[] diff = new int[nums.length];
        // for(int i = 0; i < nums.length; ++i){
        //     diff[i] = nums[i] - target;
        // }
        Map<Integer, Integer> indiff = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            indiff.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; ++i){
            int diff = target - nums[i];
            if(indiff.containsKey(diff) && indiff.get(diff) != i){
                return new int[] {i, indiff.get(diff)};
            }
        }

        return new int[0];
    }
}
