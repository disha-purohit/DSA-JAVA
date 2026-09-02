class Solution {
    public String frequencySort(String s) {
        int[] freq = new int [256];
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }
        StringBuilder ans = new StringBuilder();
        while(ans.length() < s.length()){
            int max = 0;
            int index = 0;
            for(int i = 0 ; i < 256 ; i++){
                if(freq[i] > max){
                    max = freq[i];
                    index = i;
                }
            }
            while(max > 0){
                ans.append((char) index);
                max--;
            }
            freq[index] =0;
        }
        return ans.toString();
    }
}