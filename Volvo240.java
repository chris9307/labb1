import java.awt.*;

/**
 * @author Christopher
 *
 */

public class Volvo240 extends Car {

    public final static double trimFactor = 1.25;

    public Volvo240() {
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }

    /** get speedfactor
     */
    @Override
    public double speedFactor() {
        return enginePower * 0.01 * trimFactor;
    }

    /** increase speed
     */
    @Override
    public void incrementSpeed(double amount) {
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }

    /** Decrease speed
     */
    @Override
    public void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }
}
