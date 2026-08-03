class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    Map<String, List<String>> map = new HashMap<>();
    for(String s : strs){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);
        if(map.containsKey(key)){
            map.get(key).add(s);
        }
        else{
            List <String> dum = new ArrayList<>();
            dum.add(s);
            map.put(key, dum);
        } 
    }
    List<List<String>> result = new ArrayList<>();

    for(List arr : map.values()){
        result.add(arr);
    }

    return result;
    }
}
