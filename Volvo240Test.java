import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chrba on 2017-01-25.
 */
public class Volvo240Test {
    @Test
    public void speedFactor() throws Exception {
        Volvo240 volvo = new Volvo240();
        assertEquals(volvo.speedFactor(),100*0.01*1.25);

    }

    @Test
    public void incrementSpeed() throws Exception {

        Volvo240 volvo = new Volvo240();
        double expected = Math.min( volvo.getCurrentSpeed()+ volvo.speedFactor() * 20, 100);
        volvo.incrementSpeed(20);
        double result = volvo.getCurrentSpeed();
        assertEquals(expected,result);

    }

    @Test
    public void decrementSpeed() throws Exception {

        Volvo240 volvo = new Volvo240();
        double expected = Math.max(volvo.getCurrentSpeed() - volvo.speedFactor() * 20, 0);
        volvo.decrementSpeed(20);
        double result = volvo.getCurrentSpeed();
        assertEquals(result,expected);
    }
}