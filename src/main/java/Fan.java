enum Direction {
    LEFT,
    RIGHT
}
public class Fan {
    private int speed;
    private Direction direction;
    private static final int MAX_SPEED = 3;

    /**
     * Fan Class Constructor.
     */
    public Fan() {
        this.speed = 0;
        this.direction = Direction.RIGHT;
    }

    /**
     * increases the speed of the fan based on current direction.
     */
    public void speedCord() {
        this.speed = (this.speed+1)%(MAX_SPEED+1);
    }

    /**
     * inverses the current direction of the fan.
     */
    public void directionCord() {
        if (this.direction == Direction.RIGHT) {
            this.direction = Direction.LEFT;
        } else {
            this.direction = Direction.RIGHT;
        }
    }

    /**
     * @return int speed of fan, from 0-maxSpeed.
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * @return Current direction of the fan.
     * (Direction.LEFT = left , Direction.RIGHT = right).
     */
    public Direction getDirection() {
        return this.direction;
    }

    /**
     * @return Current information on the fan's speed and direction.
     */
    public String toString() {
        return ("Fan information:\n\tCurrent Speed: "+this.speed+"\n\tCurrent Direction: "+this.direction);
    }
}
