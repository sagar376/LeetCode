class Solution {

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] missingRolls = new int[n];
        int rollsSum = 0;
        for (int roll : rolls) rollsSum += roll;

        int m = rolls.length;
        int nSum = (mean * (n + m)) - rollsSum;

        if( nSum > 6 * n || nSum <= 0 )
        return new int[0];

        int distributeMean = nSum / n;
        int mod = nSum % n;
        Arrays.fill(missingRolls, distributeMean);

        for(int i = 0; i < mod; i++)
        {
            missingRolls[i]++;
        }
        return missingRolls;
    }
}
