class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> setnum = new HashSet<>();
        for(int i = 0; i < nums.length; ++i){
            setnum.add(nums[i]);
        }
        int counter = 0;
        List<Integer> seqst = new ArrayList<>();
        for(int n : setnum){
            
            if(setnum.contains(n-1)) continue;
            else{
                int current = n;
                int length = 1;
                while (setnum.contains(current + 1)) {
                    current++;    
                    length++;
                }
                counter = Math.max(counter, length);    
            }
        }
        return counter;
    }
}
