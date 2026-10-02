class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N < 0) {
            return 1/pow(x, N);
        }
        return pow(x, N);
    }

    public double pow(double x, long n){
        if(n == 0) return 1.0;
        double half = pow(x, n/2);
        return n % 2 == 0 ? half*half : half*half*x;
    }
}