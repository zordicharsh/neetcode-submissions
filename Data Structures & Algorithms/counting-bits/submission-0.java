class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
       while(n!=0){

            int i=0;
            int j=n;
            while(j!=0){
            if((j&1)==1){
            i++;
            }
                j=j>>>1;
            }
            arr[n]=i;
            n--;
       }
        return arr;
    }
}
