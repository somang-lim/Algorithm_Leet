class Solution {
    public boolean isPalindrome(int x) {
        String integer = String.valueOf(x);
        
        String reverse = new StringBuffer(integer).reverse().toString();
        
        if (integer.equals(reverse)) {
            return true;
        }
        
        return false;
    }
}