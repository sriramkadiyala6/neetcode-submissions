class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i < nums.length; ++i){
            if(count.containsKey(nums[i])){
                int buf = count.get(nums[i]);
                buf = buf + 1;
                count.put(nums[i], buf);
            } 
            else count.put(nums[i], 1);
        }

        for(Integer value : count.values()){
            if(value > 1) return true;
        }

        return false;

    }
}