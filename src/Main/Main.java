package Main;

import Controllers.GameController;
import Views.GameView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        final JFrame window = new JFrame();
        final GameController gameController = new GameController();
        final GameView gameView = new GameView();
        final GameLoop gameLoop = new GameLoop();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Yolann's adventures");

        window.add(gameView);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gameLoop.startGameThread(gameController, gameView);
    }
}