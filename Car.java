import java.awt.*;

/**
 * @author Christopher
 *
 */
public abstract class Car implements Movable {

    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected int x,y; //  The Position of the car

    protected enum Direction{UP, DOWN, RIGHT, LEFT }
    Direction dir = Direction.UP;
    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public abstract void incrementSpeed(double amount);

    public abstract void decrementSpeed(double amount);

    public abstract double speedFactor();

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

    public void turnRight() {
        if(dir == Direction.UP) {
            dir = Direction.RIGHT;
        } else if(dir == Direction.DOWN) {
            dir = Direction.LEFT;
        } else if(dir == Direction.RIGHT) {
            dir = Direction.DOWN;
        } else if(dir == Direction.LEFT) {
            dir = Direction.UP;
        }
    }

    public void turnLeft() {
        if(dir == Direction.UP) {
            dir = Direction.LEFT;
        } else if(dir == Direction.DOWN) {
            dir = Direction.RIGHT;
        } else if(dir == Direction.RIGHT) {
            dir = Direction.UP;
        } else if(dir == Direction.LEFT) {
            dir = Direction.DOWN;
        }
    }

    public void move() {
        if(dir == Direction.UP) {
            y+=currentSpeed;
        } else if(dir == Direction.DOWN) {
            y-=currentSpeed;
        } else if(dir == Direction.RIGHT) {
            x+=currentSpeed;
        } else if(dir == Direction.LEFT) {
            x-=currentSpeed;
        }
    }

}
