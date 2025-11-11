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
}