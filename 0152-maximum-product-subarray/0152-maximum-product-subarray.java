class Solution {

    public int maxProduct(int[] nums) {
        double maxSoFar = Integer.MIN_VALUE;
        double preProd = 1;
        double suffProd = 1;

        for (int i = 0; i < nums.length; i++) {
            if (preProd == 0) preProd = 1;
            if (suffProd == 0) suffProd = 1;
            preProd *= nums[i];
            suffProd *= nums[nums.length - 1 - i];

            maxSoFar = Math.max(maxSoFar, (Math.max(preProd, suffProd)));
        }

        return (int)maxSoFar;
    }
}
