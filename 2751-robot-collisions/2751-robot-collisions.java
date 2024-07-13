class RobotData {
    int index;
    int position;
    int health;
    char direction;

    RobotData(int index, int position, int health, char direction) {
        this.index = index;
        this.position = position;
        this.health = health;
        this.direction = direction;
    }
}

class Solution {

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        List<RobotData> robots = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            robots.add(new RobotData(i, positions[i], healths[i], directions.charAt(i)));
        }

        // Sort robots by their positions
        Collections.sort(robots, (a, b) -> Integer.compare(a.position, b.position));
        Stack<RobotData> stack = new Stack<>();

        for (RobotData robot : robots) {
            if (robot.direction == 'R') {
                stack.push(robot);
            } else {
                while (!stack.isEmpty() && stack.peek().direction == 'R') {
                    RobotData rightRobot = stack.pop();

                    if (rightRobot.health > robot.health) {
                        rightRobot.health -= 1;
                        robot.health = 0;
                        stack.push(rightRobot);
                        break;
                    } else if (rightRobot.health < robot.health) {
                        robot.health -= 1;
                        rightRobot.health = 0;
                    } else {
                        rightRobot.health = 0;
                        robot.health = 0;
                        break;
                    }
                }

                if (robot.health > 0) {
                    stack.push(robot);
                }
            }
        }

        List<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));
        for (RobotData robot : stack) {
            result.set(robot.index, robot.health);
        }

        result.removeIf(health -> health == 0);
        return result;
    }
}
