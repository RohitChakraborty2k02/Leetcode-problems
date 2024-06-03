class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" ");
        int count=0;
        outer:for(int i=0;i<arr.length;i++){
            for(int j=0;j<brokenLetters.length();j++){
                if(arr[i].indexOf(brokenLetters.charAt(j)) > -1)
                    continue outer;
            }
            count++;
        }
       return count;
    }
}