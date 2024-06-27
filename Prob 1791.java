class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] arr : edges){
            map.put(arr[0],map.getOrDefault(arr[0],0) + 1);
            map.put(arr[1],map.getOrDefault(arr[1],0) + 1);
        }
        int ans = 0;
        int max = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                ans = entry.getKey();
                max = entry.getValue();
            }
        }
        return ans;
    }
}
