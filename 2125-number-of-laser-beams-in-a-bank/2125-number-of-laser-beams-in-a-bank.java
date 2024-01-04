// class Solution {
//     public int numberOfBeams(String[] bank) {
//         int size=bank.length;
//         int res=0;
//         List<Integer> floorList=new ArrayList<>();
        
//         for(String floor:bank)
//         {   
//             int count=0;
//             for(int i=0;i<floor.length();i++)
//             {
//                 if(floor.charAt(i)=='1')
//                     count++;
//             }
//             if(count>0)
//             floorList.add(count); 
//         }
        
//         for(int i=0;i<floorList.size()-1;i++)
//         {
//             res+=floorList.get(i)*floorList.get(i+1);
//         }
//         return res;
//     }
// }

//solution -2 
class Solution {
  public int numberOfBeams(String[] bank) {
    int prev = 0, ans = 0;

    for (String s: bank) {
      int count = 0;
      for (int i = 0; i < s.length(); i++)
        if (s.charAt(i) == '1') {
          count++;
        }

      if (count > 0) {
        ans += prev * count;
        prev = count;
      }
    }

    return ans;
  }
}