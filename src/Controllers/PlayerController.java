package Controllers;

import ViewModels.Player;
import static Controllers.GameController.keyHandler;
import static Handlers.Action.RIGHT;

public class PlayerController {

    public final static Player player = new Player();

    public PlayerController() {
        setDefaultPosition();
    }

    public void setDefaultPosition() {
        player.x = 100;
        player.y = 100;
        player.speed = 4;
        player.direction = RIGHT;
        player.reversed = false;
    }

    public void update() {
        if (keyHandler.upPressed) {
            player.y -= player.speed;
        }

        if (keyHandler.leftpressed) {
            player.x -= player.speed;
        }

        if (keyHandler.downPressed) {
            player.y += player.speed;
        }

        if (keyHandler.rightPressed) {
            player.x += player.speed;
        }
    }
}
