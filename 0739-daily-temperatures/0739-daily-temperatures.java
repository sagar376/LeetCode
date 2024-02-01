class Solution {
  class Pair{
    int value;
    int index;
    Pair(int value,int index)
    {
      this.value=value;
      this.index=index;
    }
  }
    public int[] dailyTemperatures(int[] temperatures) {
            Stack<Pair> tempStack = new Stack<>();
            int[] ans=new int[temperatures.length];
            for(int i=temperatures.length-1;i>=0;i--)
            {
                while(!tempStack.isEmpty())
                {
                  if(tempStack.peek().value>temperatures[i])
                  {
                    ans[i]=tempStack.peek().index-i;
                    tempStack.push(new Pair(temperatures[i],i));
                    break;
                  }
                  else
                  {
                    tempStack.pop();
                  }
                }
                if(tempStack.isEmpty())
                {
                  ans[i]=0;
                  tempStack.push(new Pair(temperatures[i],i));
                }
            }
            return ans;
                

            // ///Below BRUTE FORCE TLE
            // int[] answer =new int[temperatures.length];
            // int length = temperatures.length;
            
            // for(int i=0;i<length;i++)
            // {
            //     int warm=0;
            //     for(int j=i+1;j<length;j++)
            //     {
            //         warm++;
            //         if(temperatures[i]<temperatures[j])
            //         {
            //             answer[i]=warm;
            //             break;
            //         }
                    
                    
            //     }
                
            //     if(warm>length-i-1)answer[i]=0;
            // }
            // return answer;

    }
}