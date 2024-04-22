class Solution {
    public int openLock(String[] deadends, String target) {

// int newDigit = (currentCombination.charAt(i) - '0' + delta + 10) % 10;
/*
This line calculates a new digit based on the current digit in a given combination (like a password or lock combination) and the delta value. Here's what each part does:
currentCombination.charAt(i) gets the character at index i in the string currentCombination.
- '0' converts the character to an integer. This works because characters representing digits ('0', '1', '2', etc.) have specific numerical values, so subtracting '0' converts them to their corresponding integer values (0, 1, 2, etc.).
+ delta adds the delta value (either -1 or 1) to the current digit.
+ 10 is a trick to handle negative results. Adding 10 ensures that even if the result is negative, it remains positive.
// % 10 ensures that the result stays within the range 0-9, effectively creating a loop (circular behavior) for digits (like a circular lock).

*/
/*
String newCombination = currentCombination.substring(0, i) + newDigit + currentCombination.substring(i + 1);
This line creates a new combination (or string) by modifying one digit at a time.
currentCombination.substring(0, i) takes the beginning part of the currentCombination string, up to but not including index i.
newDigit is the new digit calculated in the previous line.
currentCombination.substring(i + 1) gets the remaining part of the string from index i + 1 to the end.
*/


        Set<String> deadendSet = new HashSet<>(Arrays.asList(deadends));
        if(deadendSet.contains("0000"))
        return -1;

        Queue<Pair<String,Integer>> queue=new LinkedList<>();
        queue.offer(new Pair<>("0000",0));
        Set<String> visited=new HashSet<>();
        visited.add("0000");

        while(!queue.isEmpty())
        {
            Pair<String,Integer> current=queue.poll();
            String currentCombination = current.getKey();
            int moves=current.getValue();

            if(currentCombination.equals(target))
            {
                return moves;
            }

            for(int i=0;i<4;i++)
            {
                for(int delta:new int[]{-1,1})
                {
                    int newDigit=(currentCombination.charAt(i)-'0'+delta+10)%10;
                    String newCombination= currentCombination.substring(0,i)+newDigit+currentCombination.substring(i+1);

                    if(!visited.contains(newCombination) && !deadendSet.contains(newCombination))
                    {
                        visited.add(newCombination);
                        queue.offer(new Pair<>(newCombination,moves+1));
                    }
                }
            }
        }
        return -1;

        
    }
}