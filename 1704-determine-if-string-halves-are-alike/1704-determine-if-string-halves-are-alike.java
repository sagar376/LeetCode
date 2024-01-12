class Solution {
    public boolean halvesAreAlike(String s) {
        
        List<Character> vowels=new ArrayList<>(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));
        int count=0;
        for(int i=0,j=s.length()/2;j<s.length();i++,j++)
        {
            if(vowels.contains(s.charAt(i)))count++;
            if(vowels.contains(s.charAt(j)))count--;
        }
        
        return count==0?true:false;
        
        
    }
}