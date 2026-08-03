class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numcount = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            if(!numcount.containsKey(nums[i])){
                numcount.put(nums[i], 1);
            }
            else{
                int buf = numcount.get(nums[i]);
                numcount.put(nums[i], ++buf);
            }
        }
        Map<Integer, List<Integer>> freqli = new HashMap<>();
       for (Map.Entry<Integer, Integer> entry : numcount.entrySet()){
            if(freqli.containsKey(entry.getValue())){
                freqli.get(entry.getValue()).add(entry.getKey());
            }
            else{
                List<Integer> dum = new ArrayList<>();
                dum.add(entry.getKey());
                freqli.put(entry.getValue(), dum);
            }
        }

        int[] res = new int[k];
        int l = 0;
        for (int j = nums.length; j >= 1 && l < k; j--){
            if(freqli.containsKey(j)){
                for (int num : freqli.get(j)) {
            res[l++] = num;
            }
            }
        }
        return res;
    }
}
