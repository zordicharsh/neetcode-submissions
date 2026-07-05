class Solution {

    public String encode(List<String> strs) {
            StringBuilder s = new StringBuilder();
            for(int i=0;i<strs.size();i++){
                int size = strs.get(i).length();
                s.append(size).append('#').append(strs.get(i));

            }
            return s.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<str.length();){
            int length = 0;
            while(str.charAt(i)!='#'){
                length = length * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;

            StringBuilder s = new StringBuilder();
            for(int j=0;j<length;j++){
                s.append(str.charAt(i));
                i++;
            }
            list.add(s.toString());
        }
        return list;
    }
}
