class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> indices = new ArrayList<>();

        int index = 0;
        for(String word : words)
        {
            if(word.contains(Character.toString(x)))
            {
                indices.add(index);
            }
            index++;

        }

        return indices;
        
    }
}