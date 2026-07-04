class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remain = target-nums[i];
            if(map.containsKey(remain)){
                 int index = map.get(remain);
                 return new int[]{index,i};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}