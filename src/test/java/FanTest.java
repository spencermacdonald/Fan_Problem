import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for Fan Class.
 */
public class FanTest
{
    Fan fan;
    @Before
    public void setUp(){
        fan = new Fan();
    }

    /**
     * Create a fan with expected initial values.
     * @Result Fan with be created with speed 0 and direction clockwise.
     */
    @Test
    public void fanInitWithExpectedValues() {
        assertEquals(0,fan.getSpeed());
        assertEquals(Direction.CLOCKWISE, fan.getDirection());
    }

    /**
     * Create a fan with expected initial values.
     * @Result Fan with be created with speed 0 and direction clockwise.
     */
    @Test
    public void fanIncrementWithExpectedValue() {
        fan.speedCord();
        assertEquals(1,fan.getSpeed());
    }

    /**
     * Create a fan object that will reach max speed of 3.
     * @Result Fan will increase to speed 3, and not overflow to 0.
     */
    @Test
    public void fanIncrementToMaxSpeed() {
        fan.speedCord();
        fan.speedCord();
        fan.speedCord();
        assertEquals(3,fan.getSpeed());
    }

    /**
     * Create a fan object that will reach max speed of 3, then overflow to 0.
     * @Result Fan will increase to speed 3, and overflow to 0.
     */
    @Test
    public void fanIncrementOverMaxSpeed() {
        fan.speedCord();
        fan.speedCord();
        fan.speedCord();
        fan.speedCord();
        assertEquals(0,fan.getSpeed());
    }

    /**
     * Create a fan object that will change direction from right to left.
     * @Result The fan swaps from its initial value of clockwise to counterclockwise.
     */
    @Test
    public void fanChangeDirection() {
        fan.directionCord();
        assertEquals(Direction.COUNTERCLOCKWISE, fan.getDirection());
    }

    /**
     * Create a fan object that will change direction, and then increase speed.
     * @Result The fans change in direction will retain after increase in speed.
     */
    @Test
    public void fanChangeDirectionThenIncreaseSpeed() {
        fan.directionCord();
        fan.speedCord();
        assertEquals(Direction.COUNTERCLOCKWISE, fan.getDirection());
        assertEquals(1, fan.getSpeed());
    }
}