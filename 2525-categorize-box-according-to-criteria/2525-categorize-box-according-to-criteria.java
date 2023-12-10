class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        double tpf = (int)Math.pow(10,4);
        double tpn = (int)Math.pow(10,9);
        double volume = (double)length * (double)width * (double)height;
        boolean bulky = false;
        boolean heavy = false;
       
        if(length >= tpf || width >= tpf || height >= tpf || volume >= tpn )
        bulky = true;
        
        if(mass >= 100)
        heavy = true;
        
        
        System.out.println("Bulky "+bulky+" heavy "+heavy+" tpn "+tpn+" tpf : "+tpf+ " volume: "+volume);
        
        if(bulky && heavy)
        {
            return "Both";
        }
        
        if(bulky && (!heavy))
            return "Bulky";
        
        if(heavy && (!bulky))
        {
            return "Heavy";
                
        }
        
        if(!(bulky && heavy))
        {
            return "Neither";
        }
        
        return "";
            
        
    }
}