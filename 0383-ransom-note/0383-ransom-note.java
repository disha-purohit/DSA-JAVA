class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arr = magazine.toCharArray();
        HashMap <Character , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < arr.length ; i++ ){
            char ch = magazine.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) +1);
        }
        char[] brr = ransomNote.toCharArray();
        for(int i = 0 ; i < brr.length; i++){
            char ch = brr[i];
            if( !map.containsKey(ch)){
                return false;
            }
            map.put(ch , map.get(ch) -1);
            if(map.get(ch) == 0){
                map.remove(ch);
            }
        
                   }
        return true;
    }
}