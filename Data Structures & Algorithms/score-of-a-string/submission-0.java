class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int j=i+1;
            if(j==s.length()){
                break;
            }
            int a = s.charAt(i);
            int b = s.charAt(j);
            sum += Math.abs(a - b);
        }
        return sum;
    }
}