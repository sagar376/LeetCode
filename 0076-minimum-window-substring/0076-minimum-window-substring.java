class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        int left=0;
        long maxLongValue = Long.MAX_VALUE;
        int have=0;
        String result="";

        for(int i=0;i<t.length();i++)
        {
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        }
        
        long need=tmap.size(); /// Very important stuck here when input was s='aa' and t='aa' 

        for(int right=0;right<s.length();right++)
        {
            smap.put(s.charAt(right),smap.getOrDefault(s.charAt(right),0)+1);

            //if(tmap.containsKey(s.charAt(right)) && (smap.get(s.charAt(right))==tmap.get(s.charAt(right))))
            if(tmap.containsKey(s.charAt(right)) && (smap.get(s.charAt(right)).equals(tmap.get(s.charAt(right)))))
            have= have +1;

            while(have == need)
            {
                if ((right - left + 1) < maxLongValue) {
                        maxLongValue = right - left + 1;
                        result = s.substring(left, right + 1);
                    }
                smap.put(s.charAt(left),smap.getOrDefault(s.charAt(left),0)-1);

                if(tmap.containsKey(s.charAt(left)) && (smap.get(s.charAt(left)) < tmap.get(s.charAt(left))))
                {
                    have = have - 1;
                }
                //System.out.println(s.substring(left,right+1) + " left =" + left + " right=" + right + " Res=" + maxLongValue);
                left = left +1;
                
            }

        }
        if(maxLongValue == Long.MAX_VALUE)
        {
            return "";
        }
        return result;
        
    }
}