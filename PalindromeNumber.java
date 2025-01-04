/*
Given an integer x, return true if x is a palindrome, and false otherwise.
*/

class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int size = num.length() - 1;
        for (int i = 0; i < num.length() / 2; i++){
            if (num.charAt(i) != num.charAt(size)){
                return false;
            }
            size --;
        }
        return true;
    }
}
