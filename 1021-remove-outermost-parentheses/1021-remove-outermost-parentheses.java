class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                count++;
                if (count > 1){
                    ans.append('(');
                }
            }
            else{
                count--;
                if (count > 0){
                    ans.append(')');
                }
            }
        }
        return ans.toString();
    }
}