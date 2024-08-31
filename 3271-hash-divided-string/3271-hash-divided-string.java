class Solution {
    public String stringHash(String s, int k) {

        String result = "";

        int idx = 0;
        while(idx < s.length())
        {
            int hashSum = 0;
            for(int i = 0; i < k; i++)
            {
                hashSum += s.charAt(idx) - 'a';
                idx++;
            }

            result += (char)('a' + (hashSum%26));
        }
        return result;
        
    }
}