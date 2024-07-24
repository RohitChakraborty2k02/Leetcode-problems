class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int key = 0;
            String num = String.valueOf(nums[i]);
            for (char ch : num.toCharArray())
                key = (key * 10) + mapping[ch - '0'];

            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(nums[i]);
        }
        int index = 0;
        for (List<Integer> list : map.values())
            for (int value : list)
                nums[index++] = value;
        return nums;   
    }
}