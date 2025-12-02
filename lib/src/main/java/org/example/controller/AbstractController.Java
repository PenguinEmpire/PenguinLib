public class AbstractController {
    //Controller information
    public abstract int ID; //Determine the controller's ID
    public abstract String controllerType; //For differentiating which controller brand is being used

    /**
     * Initializes controller and its variables
     * @see 
     */
    @NotImplimented()
    public abstract void CreateController(int controllerID, String controllerTypeName);

    @NotImplimented()
    public abstract JoystickPosition GetLeftJoystick();

    @NotImplimented()
    public abstract JoystickPosition GetRightJoystick();
    
    //POV/left side buttons (1, 2, 3, 4 -> up, left, down, right)
    @NotImplimented()
    public abstract Boolean GetPov1();

    @NotImplimented()
    public abstract Boolean GetPov2();

    @NotImplimented()
    public abstract Boolean GetPov3();

    @NotImplimented()
    public abstract Boolean GetPov4();

    //right side buttons (1, 2, 3, 4 -> up, left, down, right)
    @NotImplimented()
    public abstract Boolean GetButton1();

    @NotImplimented()
    public abstract Boolean GetButton2();

    @NotImplimented()
    public abstract Boolean GetButton3();

    @NotImplimented()
    public abstract Boolean GetButton4();

    //Buttons on the back of the controller (R=Right, L=Left, 1 means closest to top, 2 means under 1)
    @NotImplimented()
    public abstract float GetR1();

    @NotImplimented()
    public abstract float GetL1();

    @NotImplimented()
    public abstract Boolean GetR2();

    @NotImplimented()
    public abstract Boolean GetL2();
}