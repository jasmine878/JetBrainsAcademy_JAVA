class Move {
//    public static void main(String[] args) {
//        Robot robot1 = new Robot(0, 0, Direction.UP);
//        print(robot1);
//        moveRobot(robot1, 3, 0);
//        print(robot1);
//        System.out.println();
//
//        Robot robot2 = new Robot(1, 1, Direction.RIGHT);
//        print(robot2);
//        moveRobot(robot2, 0, -1);
//        print(robot2);
//        System.out.println();
//    }

//    public static void print(Robot robot) {
//        System.out.println("robot is at x: " +
//                robot.getX() + ", y: " +
//                robot.getY() + ", facing " +
//                robot.getDirection());
//    }


    public static void moveRobot(Robot robot, int toX, int toY) {
//        robot.stepForward(); // your implementation here
        int travelX = toX - robot.getX();
        int travelY = toY - robot.getY();

        if (travelX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                if (robot.getDirection() == Direction.UP || robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
//                    System.out.println("TURN RIGHT");
                } else {
                    robot.turnLeft();
//                    System.out.println("TURN LEFT");
                }
            }

            for (int i = 0; i < travelX; i++) {
                robot.stepForward();
//                System.out.println("step forward");
            }
        } else if (travelX < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection() == Direction.UP || robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
//                    System.out.println("TURN LEFT");
                } else {
                    robot.turnRight();
//                    System.out.println("TURN RIGHT");
                }
            }

            for (int i = 0; i > travelX; i--) {
                robot.stepForward();
//                System.out.println("step forward");
            }
        }

        if (travelY > 0) {
            while (robot.getDirection() != Direction.UP) {
                if (robot.getDirection() == Direction.DOWN || robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
//                    System.out.println("TURN RIGHT");
                } else {
                    robot.turnLeft();
//                    System.out.println("TURN LEFT");
                }
            }

            for (int i = 0; i < travelY; i++) {
                robot.stepForward();
//                System.out.println("step forward");
            }
        } else if (travelY < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                if (robot.getDirection() == Direction.UP || robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
//                    System.out.println("TURN LEFT");
                } else {
                    robot.turnRight();
//                    System.out.println("TURN RIGHT");
                }
            }

            for (int i = 0; i > travelY; i--) {
                robot.stepForward();
//                System.out.println("step forward");
            }
        }
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
