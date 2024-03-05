class Solution {
public:
    string countAndSay(int n) {
        int acum = 1;
        string result = "";
        string aux = "1";
        if(n==1) return aux;
        for(int i=0; i<n; i++){
            for(int j=0; j<aux.length(); j++){
                if(aux[j+1]==aux[j]){
                    acum++;
                }else{
                    result += to_string(acum) + aux[j];
                    acum = 1;
                }
            }
            aux = result;
            result ="";
        }
        return aux;
    }
};