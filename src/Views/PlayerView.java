package Views;

import Handlers.AnimationActions;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import static Controllers.PlayerController.player;
import static Handlers.Action.*;
import static Handlers.Role.WARRIOR;

public class PlayerView extends JPanel {


    public void paintComponent(Graphics2D graphics2D) {

        switch (player.direction) {
            case UP:
            case DOWN:
                Objects.requireNonNull(AnimationActions.returnRightAnimation(WARRIOR, WALK)).paint(graphics2D, player.x, player.y, player.reversed);
                break;
            case LEFT:
                player.reversed = true;
                Objects.requireNonNull(AnimationActions.returnRightAnimation(WARRIOR, WALK)).paint(graphics2D, player.x, player.y, true);
                break;
            case RIGHT:
                player.reversed = false;
                Objects.requireNonNull(AnimationActions.returnRightAnimation(WARRIOR, WALK)).paint(graphics2D, player.x, player.y, false);
                break;
            case IDLE:
                Objects.requireNonNull(AnimationActions.returnRightAnimation(WARRIOR, IDLE)).paint(graphics2D, player.x, player.y, player.reversed);
                break;
            case JUMP:
                Objects.requireNonNull(AnimationActions.returnRightAnimation(WARRIOR, JUMP)).paint(graphics2D, player.x, player.y, player.reversed);
                break;
            case ATTACK:
                Objects.requireNonNull(AnimationActions.returnRightAnimation(WARRIOR, ATTACK)).paint(graphics2D, player.x, player.y, player.reversed);
                break;
            case DEAD:
                Objects.requireNonNull(AnimationActions.returnRightAnimation(WARRIOR, DEAD)).paint(graphics2D, player.x, player.y, player.reversed);
        }
    }
}
