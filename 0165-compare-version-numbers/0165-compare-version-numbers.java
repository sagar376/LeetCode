class Solution {
    public int compareVersion(String version1, String version2) {
        int[] intArray1 = Arrays.stream(version1.split("\\."))
    .mapToInt(Integer::parseInt)
    .toArray();
        int[] intArray2 = Arrays.stream(version2.split("\\."))
    .mapToInt(Integer::parseInt)
    .toArray();



     int size=intArray1.length>=intArray2.length?intArray1.length:intArray2.length;
     for(int i=0;i<size;i++)
     {
        int num1=i<intArray1.length?intArray1[i]:0;
        int num2=i<intArray2.length?intArray2[i]:0;

        if(num1<num2)
        {
            return -1;
        }
        else if(num1>num2)
        {
            return 1;
        }
     }
     return 0;   
    }
}