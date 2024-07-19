class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> minList = new ArrayList<>();
        ArrayList<Integer> maxList = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min = matrix[i][0];
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
            minList.add(min);
        }
        for(int i=0;i<matrix[0].length;i++){
            int max = matrix[0][i];
            for(int j=1;j<matrix.length;j++){
                if(max<matrix[j][i]){
                    max=matrix[j][i];
                }
            }
            maxList.add(max);
        }
        for(int i=0;i<minList.size();i++){
            if(!maxList.contains(minList.get(i))){
                minList.remove(i);
                i--;
            }
        }
        return minList;
    }
}