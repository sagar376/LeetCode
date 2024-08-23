class Solution {
    public String fractionAddition(String expression) {
        String[] nums = expression.split("(?=[-+])");
        
        int a = 0;
        int b = 1;

        for (String num : nums) {
            String[] fraction = num.split("/");
            int c = Integer.valueOf(fraction[0]);
            int d = Integer.valueOf(fraction[1]);

            a = (a * d) + (c * b);
            b = b * d;

            int gcd = GCD(Math.abs(a), b);
            a = a / gcd;
            b = b / gcd;
        }

        return a + "/" + b;
    }

    public int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
