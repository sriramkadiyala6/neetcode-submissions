class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int[] ret = new int[2];
        while(i != j){
            if(numbers[i] + numbers[j] == target){
                ret[0] = i+1;
                ret[1] = j+1;
                return ret;
            } 
            if(numbers[i] + numbers[j] > target) j--;
            if(numbers[i] + numbers[j] < target) i++;
        }
        //return [1,1];
        return new int[2];
    }
}
