class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append('#');
            sb.append(s);
        }
        String res = sb.toString();
        System.out.println(res);
        return res;
    }

    public List<String> decode(String str) {
        List<String> dec = new ArrayList<>();
        //StringBuilder buf = new StringBuilder();
        int i = 0;
        while(i < str.length()){
            int j = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, j));
            String s = str.substring(j + 1, j + 1 + len);
            dec.add(s);
            i = j + len + 1;
        }
        return dec;
    }
}
