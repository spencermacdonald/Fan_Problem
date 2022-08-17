enum Direction {
    CLOCKWISE,
    COUNTERCLOCKWISE
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
        this.direction = Direction.CLOCKWISE;
    }

    /**
     * increases the speed of the fan up to Max Speed.
     */
    public void speedCord() {
        this.speed = (this.speed+1)%(MAX_SPEED+1);
    }

    /**
     * inverses the current direction of the fan.
     */
    public void directionCord() {
        if (this.direction == Direction.CLOCKWISE) {
            this.direction = Direction.COUNTERCLOCKWISE;
        } else {
            this.direction = Direction.CLOCKWISE;
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
     * (Direction.CLOCKWISE = Clockwise , Direction.COUNTERCLOCKWISE = Counterclockwise).
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
