package Main;

import Controllers.GameController;
import Views.GameView;

public class GameLoop implements Runnable {

    private Thread gameThread;
    private GameController gameController;
    private GameView gameView;


    public void startGameThread(GameController gameController, GameView gameView) {

        this.gameController = gameController;
        this.gameView = gameView;
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        // MAX_FPS
        int MAX_FPS = 60;
        double drawInterval = (Math.pow(10, 9)) / MAX_FPS;
        long lastTime = System.nanoTime();
        long currentTime;
        double delta = 0;
        long timer = 0;
        int drawCount = 0;

        while(gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if (delta >= 1) {
                gameController.update();
                gameView.repaint();
                delta--;
                drawCount++;
            }

            if (timer >= Math.pow(10, 9)) {
                System.out.println("FPS: " + drawCount);
                drawCount = 0;
                timer = 0;
            }
        }
    }
}
