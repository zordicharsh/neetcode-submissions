class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        boolean inserted = false;

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] >= newInterval[0]&&intervals[i][0] <= newInterval[1]) {
                
                    newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                    newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
                else {
                    if (intervals[i][1] < newInterval[0]) {
                        ans.add(intervals[i]);
                    } else if (intervals[i][0] > newInterval[1]) {
                        if (!inserted) {
                            ans.add(newInterval);
                            inserted = true;
                        }

                        ans.add(intervals[i]);
                    }
                }
            
        }

         if (!inserted) {
            ans.add(newInterval);
        }
        return  ans.toArray(new int[ans.size()][]);
    }
}
