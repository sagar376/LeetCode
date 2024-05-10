import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        // List to store the fractions with numerator and denominator
        List<int[]> fractions = new ArrayList<>();

        // Generate all possible fractions (i/j where i < j)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                fractions.add(new int[]{arr[i], arr[j]});
            }
        }

        // Sort the fractions based on their division result
        Collections.sort(fractions, new Comparator<int[]>() {
            @Override
            public int compare(int[] f1, int[] f2) {
                double fraction1 = (double) f1[0] / f1[1];
                double fraction2 = (double) f2[0] / f2[1];
                return Double.compare(fraction1, fraction2);
            }
        });

        // Return the k-th smallest fraction
        return fractions.get(k - 1); // k-1 to get the k-th fraction (0-based index)
    }
}
