// Given a 32-bit signed integer, reverse digits of an integer.

// Example
// Input: 123
// Output: 321
public class Solution {
    public int Reverse(int x) {
        int rev = 0;
        while(x!=0){
            int pop = x % 10;
            x = x/10;

            // TODO: Check max integer

            rev = rev *10 + pop;
        }
        return rev;
        
    }
}