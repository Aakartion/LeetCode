class Solution {
    public boolean isRobotBounded(String instructions) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0, y = 0; // Initial position
        int dir = 0; // Initial direction (north)

        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'G') {
                x += directions[dir][0];
                y += directions[dir][1];
            } else if (instruction == 'L') {
                dir = (dir + 3) % 4; // Turn left (anti-clockwise)
            } else if (instruction == 'R') {
                dir = (dir + 1) % 4; // Turn right (clockwise)
            }
        }

        // After one cycle:
        // If the robot returns to the origin or is not facing north, it will stay within a bounded area.
        return (x == 0 && y == 0) || dir != 0;
        }
}