// class Solution {
//     public long wonderfulSubstrings(String word) {
//         int N = word.length();

//         // Create the frequency map
//         // Key = bitmask, Value = frequency of bitmask key
//         Map<Integer, Integer> freq = new HashMap<>();

//         // The empty prefix can be the smaller prefix, which is handled like this
//         freq.put(0, 1);

//         int mask = 0;
//         long res = 0L;
//         for (int i = 0; i < N; i++) {
//             char c = word.charAt(i);
//             int bit = c - 'a';

//             // Flip the parity of the c-th bit in the running prefix mask
//             mask ^= (1 << bit);
            
//             // Count smaller prefixes that create substrings with no odd occurring letters
//             res += freq.getOrDefault(mask, 0);

//             // Increment value associated with mask by 1
//             freq.put(mask, freq.getOrDefault(mask, 0) + 1);

//             // Loop through every possible letter that can appear an odd number of times in a substring
//             for (int odd_c=0; odd_c < 10; odd_c++) {
//                 res += freq.getOrDefault(mask ^ (1 << odd_c),0);
//             }
//         }
//         return res;
//     }
// }
class Solution {
    public long wonderfulSubstrings(String word) {
        int[] count = new int[1024]; // 2^10 to store bitmask frequencies
        count[0] = 1;
        long result = 0;
        int bitmask = 0;

        for (char ch : word.toCharArray()) {
            int charIndex = ch - 'a';
            bitmask ^= 1 << charIndex;
            result += count[bitmask];
            for (int i = 0; i < 10; i++) {
                result += count[bitmask ^ (1 << i)];
            }
            count[bitmask]++;
        }

        return result;
    }
}