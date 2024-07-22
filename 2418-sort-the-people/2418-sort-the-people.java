class Solution {

    class Person{
        String name;
        int height;
        Person(String name,int height)
        {
            this.name = name;
            this.height = height;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        
        Person[] person=new Person[names.length];
        for(int i=0;i < names.length ; i++)
        {
            person[i]=new Person(names[i],heights[i]);
        }

        PriorityQueue<Person> pq = new PriorityQueue<>((a,b)-> b.height-a.height);

        // pq.addAll(Arrays.asList(person));

        // Add all Person objects to the PriorityQueue
        for (Person person : persons) {
            pq.add(person);
        }

        String[] result = new String[names.length];
        int index = 0;
        while(!pq.isEmpty())
        {
            Person curr = pq.poll();
            result[index++] = curr.name;
        }

        return result;
    }
}