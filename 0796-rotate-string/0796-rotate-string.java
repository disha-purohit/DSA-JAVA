class Solution {
    public boolean rotateString(String s, String goal) {
        
        if (s.length()  != goal.length()){
            return false;
        }
        String doubles = s + s;
        if(doubles.contains(goal)){
            return true;
        }
        return false;
    }
}