class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i,j;
        for(i=0;i<=(nums.length-1);i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr.add(i);
                    arr.add(j);
                    return arr.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
       return arr.stream().mapToInt(Integer::intValue).toArray(); 
    }
}