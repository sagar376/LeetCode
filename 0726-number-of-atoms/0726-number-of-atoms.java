class Solution {

    public String countOfAtoms(String formula) {
        Stack<HashMap<String, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>());
        int n = formula.length();
        int index = 0;

        while (index < n) {
            if (formula.charAt(index) == '(') {
                stack.push(new HashMap<>());
                index++;
            } else if (formula.charAt(index) == ')') {
                StringBuilder multiplier = new StringBuilder();
                HashMap<String, Integer> currMap = stack.pop();
                index++;

                while (index < n && Character.isDigit(formula.charAt(index))) {
                    multiplier.append(formula.charAt(index));
                    index++;
                }
                if (multiplier.length() > 0) {
                    int mult = Integer.parseInt(multiplier.toString());
                    for (String atom : currMap.keySet()) {
                        currMap.put(atom, currMap.get(atom) * mult);
                    }
                }
                //merge back into stack HashMap

                for (String atom : currMap.keySet()) {
                    stack.peek().put(atom, stack.peek().getOrDefault(atom, 0) + currMap.get(atom));
                }
            }
            // Otherwise, it must be a UPPERCASE LETTER. Extract the complete
            // atom with frequency, and update the most recent hashmap
            else {
                StringBuilder currAtom = new StringBuilder();
                currAtom.append(formula.charAt(index));
                index++;

                //check for lowercase character
                while (index < n && Character.isLowerCase(formula.charAt(index))) {
                    currAtom.append(formula.charAt(index));
                    index++;
                }

                //check for digit if present
                StringBuilder currCount = new StringBuilder();
                while (index < n && Character.isDigit(formula.charAt(index))) {
                    currCount.append(formula.charAt(index));
                    index++;
                }

                int count = currCount.length() > 0 ? Integer.parseInt(currCount.toString()) : 1;
                stack.peek().put(currAtom.toString(), stack.peek().getOrDefault(currAtom.toString(), 0) + count);
            }
        }

        // Sort the final map
        TreeMap<String, Integer> finalMap = new TreeMap<>(stack.pop());

        //Generate answer String
        StringBuilder ans = new StringBuilder();
        for (String atom : finalMap.keySet()) {
            ans.append(atom);
            if (finalMap.get(atom) > 1) {
                ans.append(finalMap.get(atom));
            }
        }
        return ans.toString();
    }
}
