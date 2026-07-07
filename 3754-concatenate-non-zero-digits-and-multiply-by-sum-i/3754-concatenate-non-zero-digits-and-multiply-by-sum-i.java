class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0, x = 0;
        int divisor = 1;
        while (n / divisor >= 10) {
            divisor *= 10;
        }
        while (divisor > 0) {
            int digit = n / divisor;
            if (digit != 0) {
                x = (x * 10) + digit;
                sum = sum + digit;
            }
            n = n % divisor;
            divisor = divisor / 10;
        }
        return (long)x * sum;
    }
}