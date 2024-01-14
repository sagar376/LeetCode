class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        
//         int[] arr1 = new int[26], arr2 = new int[26];
//         for (char ch : word1.toCharArray())
//             arr1[ch - 'a']++;
//         for (char ch : word2.toCharArray())
//             arr2[ch - 'a']++;
// 		for(int i:arr1)
//         {
//             System.out.print(i+" ");
//         }
//          System.out.println();
//         for(int i:arr2)
//         {
//             System.out.print(i+" ");
//         }
//         System.out.println();
// 		//if one has a letter which another one doesn't have, dont exist
//         for (int i = 0; i < 26; i++) {
//             if (arr1[i] == arr2[i]) {
//                 continue;
//             }
//             if (arr1[i] == 0 || arr2[i] == 0) {
//                 System.out.println(i+" ");
//                 return false;
//             }
//         }
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         for (int i = 0; i < 26; i++) {
//             if (arr1[i] != arr2[i]) {
//                 return false;
//             }
//         }
//         return true;
        

//         if (word1.length() != word2.length()) {
// 		return false;
// 	}
	Map<Character, Integer> word1Map = new HashMap<>();
	Map<Character, Integer> word2Map = new HashMap<>();
	for (char c : word1.toCharArray()) {
		word1Map.put(c, word1Map.getOrDefault(c, 0) + 1);
	}
	for (char c : word2.toCharArray()) {
		word2Map.put(c, word2Map.getOrDefault(c, 0) + 1);
	}
	if (!word1Map.keySet().equals(word2Map.keySet())) {
		return false;
	}
        
       // Important code below
//to convert hashMap values to ArrayList
	List<Integer> word1FrequencyList = new ArrayList<>(word1Map.values());
	List<Integer> word2FrequencyList = new ArrayList<>(word2Map.values());
	Collections.sort(word1FrequencyList);
	Collections.sort(word2FrequencyList);
	return word1FrequencyList.equals(word2FrequencyList);
        
        //return Collections.sort(word1Map.values()).equals(Collections.sort(word2Map.values()));
        
    }
}