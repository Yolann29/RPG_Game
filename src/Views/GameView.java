package Views;

import javax.swing.*;
import java.awt.*;
import static Controllers.GameController.keyHandler;
import static ViewModels.Game.screenHeight;
import static ViewModels.Game.screenWidth;

public class GameView extends JPanel {

    final static public PlayerView playerView = new PlayerView();


    public GameView() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }

    public void paintComponent(Graphics graphics) {

        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;

        playerView.paintComponent(graphics2D);
    }
}
