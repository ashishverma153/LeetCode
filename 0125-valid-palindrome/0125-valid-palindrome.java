class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");

        int i = 0;
        int j = s.length() - 1; 
        while (j >= i) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
