class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> count1 = new HashMap<>();
        Map<Character, Integer> count2 = new HashMap<>();

        for(int i = 0; i < s.length(); ++i){
            if(count1.containsKey(s.charAt(i))){
                int buf = count1.get(s.charAt(i));
                count1.put(s.charAt(i), ++buf);
            }
            else count1.put(s.charAt(i), 0);
        }

        for(int i = 0; i < t.length(); ++i){
            if(count2.containsKey(t.charAt(i))){
                int buf = count2.get(t.charAt(i));
                count2.put(t.charAt(i), ++buf);
            }
            else count2.put(t.charAt(i), 0);
        }

        return count1.equals(count2);
    }
}
