class RandomizedSet {
    
    HashSet<Integer> set;

    public RandomizedSet() {
        set=new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(set.contains(val))return false;
        set.add(val);
        return true;
        
    }
    
    public boolean remove(int val) {
        if(!set.contains(val))return false;
        set.remove(val);
        return true;
        
        
    }
    
    public int getRandom() {
        //Using Array
        Integer[] rand= set.toArray(new Integer[set.size()]);
        
        //rand=set.toArray();
        
        Random rdm=new Random();
        
        return rand[rdm.nextInt(set.size())];
        
//         Random random = new Random();
//         int randomNumber = random.nextInt(set.size());
        
        
//         Iterator<Integer> iterator = set.iterator(); 
  
//         int currentIndex = 0; 
//         int randomElement = 0; 
  
//         // iterate the HashSet 
//         while (iterator.hasNext()) { 
  
//             randomElement = iterator.next(); 
  
//             // if current index is equal to random number 
//             if (currentIndex == randomNumber) 
//                 return randomElement; 
  
//             // increase the current index 
//             currentIndex++; 
//         } 
  
//         return randomElement; 
        
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */