class Solution {
    public boolean isPowerOfTwo(int n) {
        //BIT manipulation approach
        return n > 0 && (n&(n-1)) == 0;
    }
}