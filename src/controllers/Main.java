package controllers;

public class Main {

    /* DEBUG BOOLEAN FOR FURTHER DEBUGGING
     * this is used by calling Main.debug(String); */
    private static boolean DEBUG = false;

    private GameController game = new GameController();

    /* THE BRAINS */
    private static GameController controller = new GameController();

    /* APPLICATION STARTS HERE */
    public static void main(String[] args) { controller.showGameScene(); }

//    /* GETTERS */
//    public static GameController getController() { return Main.controller; }
    /* SETTERS */
//    public static void debug (String out) { if(DEBUG) { System.out.println(out); } }
}