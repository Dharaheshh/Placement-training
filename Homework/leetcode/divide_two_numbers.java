package leetcode;
class divide_two_numbers {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor== -1) return Integer.MAX_VALUE;
        return dividend/divisor;
    }
}