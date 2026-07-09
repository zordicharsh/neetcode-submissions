class Solution {
    public void rotate(int[] nums, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        map.put(((i+k)%nums.length),nums[i]);
    }

    for (int key : map.keySet()) {
    // System.out.println("Key: " + key);
    // System.out.println("Value: " + map.get(key));

    nums[key]=map.get(key);
}

    
    }
}