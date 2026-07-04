class Solution {
    public boolean isPalindrome(String s) {
        int end1 = s.length()-1;
        int start1 = 0;
        while(start1<end1){

            char start=s.charAt(start1);
            char end=s.charAt(end1);
            if(!Character.isLetterOrDigit(start)){
                start1++;
                continue;
            }
            if(!Character.isLetterOrDigit(end)){
                end1--;
                continue;
            }

            if(Character.toLowerCase(start) != Character.toLowerCase(end)){
                return false;
            }

            start1++;
            end1--;
        }
        return true;
    }
}
