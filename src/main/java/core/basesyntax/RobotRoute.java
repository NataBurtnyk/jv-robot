package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction currentDirection = robot.getDirection();
        int currentX = robot.getX();

        if (toX > currentX && currentDirection != Direction.RIGHT) {
            if(currentDirection == Direction.UP) {
                robot.turnRight();
            } else if(currentDirection == Direction.DOWN) {
                robot.turnLeft();
            } else if (currentDirection == Direction.LEFT) {
                robot.turnLeft();
                robot.turnLeft();
            }

            int stepsToGo = toX - currentX;

            for(int i = 0; i < stepsToGo; i++) {
                robot.stepForward();
            }
        }


        if (toX < currentX && currentDirection != Direction.LEFT) {
            if(currentDirection == Direction.UP) {
                robot.turnLeft();
            } else if(currentDirection == Direction.DOWN) {
                robot.turnRight();
            } else if (currentDirection == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            }
            int stepsToGo = Math.abs(toX - currentX);

            for(int i = 0; i < stepsToGo; i++) {
                robot.stepForward();
            }
        }

    }
}
