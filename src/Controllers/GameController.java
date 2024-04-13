package Controllers;

public class GameController {

    public final static KeyHandler keyHandler = new KeyHandler();
    public final static PlayerController playerController = new PlayerController();


    public void update() {

        playerController.update();
    }
}
