// class Solution {
//     public int minMovesToSeat(int[] seats, int[] students) {

//         // Arrays.sort(seats);
//         // Arrays.sort(students);

//         // int minMoves=0;
//         // for(int i=0;i<students.length;i++)
//         // {
//         //     minMoves+=Math.abs(seats[i]-students[i]);
//         // }

//         // return minMoves;

        
//     }
// }

class Solution {

    public int minMovesToSeat(int[] seats, int[] students) {

        int[] position_seat=new int[101];
        int[] position_stud=new int[101];

        int moves=0;

        for(int i=0;i<seats.length;i++)
        {
            position_seat[seats[i]]++;
            position_stud[students[i]]++;
        }

        int numOfStudents=students.length;
        int i=0,j=0;
        while(numOfStudents>0)
        {
            if(position_seat[i]==0)i++;
            if(position_stud[j]==0)j++;

            if(position_seat[i]>0 && position_stud[j]>0)
            {
                position_seat[i]--;
                position_stud[j]--;
                moves+=Math.abs(i-j);
                numOfStudents--;
            }

        }
        return moves;
        
    }
}