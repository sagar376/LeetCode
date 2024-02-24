class Solution {
    public int[] asteroidCollision(int[] asteroids) {
//         Intuition
// So the first thing to notice is that if the starting of the given array has asteroid that moves in negative direction we have nothing to do with that asteroid.Cuz even if its neighbour asteriod is negative it still moves with it without colliding and also if its neighbour is a positive asteroid it moves in the opposite direction of the negative asteroid.The second thing to notice is that if two asteroids meet, the smaller one will explode. This feature can easily be done using stack data structure.The next thing is if both are the same size, both will explode.This feature can also be done using stack by popping the top two elements.

// Keep in mind--Two asteroids moving in the same direction will never meet.

// Create a outer for loop that pushes the element into the stack one by one.. And inside of it make a while loop that continously check whether the coditions are met and it alters the stack accordingly.

// At last just copy the elements of the stack in the vector and reverse it and then return it.

        Stack<Integer> st=new Stack<>();

        for(int a:asteroids)
        {
            if(a>0)
            {
                st.push(a);
            }
            else
            {
                while(!st.isEmpty() && st.peek() > 0  && st.peek() < Math.abs(a))
                {
                    st.pop();
                }

                if(st.isEmpty() || st.peek() < 0)
                {
                    st.push(a);
                }
                else if(st.peek() + a ==0)
                {
                    st.pop();
                }
            }
        }




        int[] answer=new int[st.size()];
        //print in reverse order
        int index=st.size()-1;
        while(!st.isEmpty())
        {
            answer[index]=st.pop();
            index--;
        }
        return answer;
    }
}