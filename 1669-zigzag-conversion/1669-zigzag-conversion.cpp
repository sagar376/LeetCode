class Solution {
public:
    string convert(string s, int nRows) {
        string res;
        int n = s.size();
        int strip = nRows*2;
        for(int i=0;i<nRows;i++){
            if(strip>2)
                strip -=2;
            else
                strip = 2*nRows-2;
           
            for(int j=i;j<n;)
            {
                res += s[j];
                j += strip;
                if(strip != nRows*2-2)
                    strip = nRows*2-2 - strip;
            }
        }
        return res;
    }
};