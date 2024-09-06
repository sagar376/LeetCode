class Solution {

    private static final int HASH_MULTIPLIER = 60013;
    public int robotSim(int[] commands, int[][] obstacles) {

        Set<Integer> obstacleSet = new HashSet<>();
        for(int[] obstacle : obstacles)
        {
            obstacleSet.add(hashCoordinates(obstacle[0], obstacle[1]));
        }

        int[][] directions = {{0, 1}, {1, 0} ,{0, -1}, {-1, 0}};

        int[] currentPosition = {0, 0};
        int currentDirection = 0; // start with north direction {0, 0}

        
        int maxDistance = Integer.MIN_VALUE;
        for(int command: commands)
        {
            if(command == -2)
            {
                currentDirection = (currentDirection + 3) % 4;
                continue;
            }
            if(command == -1)
            {
                currentDirection = (currentDirection + 1) % 4;
                continue;
            }

            int[] direction = directions[currentDirection];
            for(int step = 0; step < command; step ++)
            {
                int nextX = currentPosition[0] + direction[0];
                int nextY = currentPosition[1] + direction[1];
                if(obstacleSet.contains(hashCoordinates(nextX, nextY)))
                {
                    break;
                }
                currentPosition[0] = nextX;
                currentPosition[1] = nextY;
            }

            maxDistance =  Math.max(maxDistance, currentPosition[0] * currentPosition[0] + currentPosition[1] * currentPosition[1] );

        }

        return maxDistance;


        
        
    }

    private int hashCoordinates(int x, int y)
    {
        return x + HASH_MULTIPLIER * y;
    }
}