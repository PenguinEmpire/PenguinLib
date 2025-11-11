public class AbstractMotor {
    //Motor information
    public abstract int ID; //Determine the motor's ID
    public abstract String motorType; //For differentiating which motor is being used

    //Motor variables
    public abstract Boolean backwards; //For inverting motor direction
    public abstract float targetPosition; //For PID and Motion profiling

    //PID constants
    public abstract int P; //P value of PID (controls how fast it accelerates)
    public abstract int I; //I value of PID (controls how quickly it corrects itself in overshoot)
    public abstract int D; //D value of PID (controls predicting the target. Rarely ever used)

    /**
     * Initializes motor and its variables
     * @see 
     */
    @NotImplimented()
    public abstract void CreateMotor(Boolean directionBackward, int motorID, String motorTypeName);

    /**
     * Sets the speed of the motor
     * @see 
     */
    @NotImplimented()
    public abstract void SetSpeed();


    /**
     * Sets target position of motor
     * @see 
     */
    @NotImplimented()
    public abstract void SetPosition(float target);

    /**
     * Sets PID values of the motor
     * @see 
     */
    @NotImplimented()
    public abstract void SetPID(float PValue, float IValue, float DValue);
}