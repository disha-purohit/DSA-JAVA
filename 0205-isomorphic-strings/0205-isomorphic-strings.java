class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] sarr = new int[256];
        int[] tarr = new int[256];
        for(int i = 0 ; i < s.length() ; i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(sarr[a] != tarr[b]){
                return false;
            }
            sarr[a] = i+1;
            tarr[b] = i+1;
        }
        return true;
        
    }
}