package Handlers;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

import static ViewModels.Game.tileSize;

public class Animation {

    private final BufferedImage sprite;
    private final int frameCount;
    private final long frameDuration;
    private long time;
    private final BufferedImage shadow;


    public Animation(String sprite, int frameCount, long frameDuration) {

        try {
            System.out.println(sprite);
            this.sprite = ImageIO.read(Objects.requireNonNull(this.getClass().getResourceAsStream(sprite)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.frameCount = frameCount;
        this.frameDuration = frameDuration;
        this.time = System.currentTimeMillis();
        shadow = new BufferedImage(tileSize, tileSize, BufferedImage.TYPE_INT_ARGB);
    }

    public void paint(Graphics2D g2, int x, int y, boolean reversed){

        final int height = tileSize;
        final int width = tileSize;
        int frameIndex = 0;
        long elapsed = System.currentTimeMillis() - time;
        if(elapsed >= frameDuration * frameCount){
            elapsed = 0;
            time = System.currentTimeMillis();
        }
        frameIndex = (int) Math.min(elapsed / frameDuration, frameCount - 1);
        int u = frameIndex * sprite.getWidth() / frameCount;

        Graphics2D g2d = shadow.createGraphics();

        g2d.setComposite(AlphaComposite.Clear);
        g2d.fillRect(0, 0, 32, 32);
        g2d.setComposite(AlphaComposite.Src);
        g2d.setColor(new Color(0,0,0,50));
        g2d.fillOval(0, 0, 32, 32 / 2);
        g2d.dispose();

        g2.drawImage(shadow, x, (int) (y + height / 1.4), width, height, null);

        if(reversed){
            g2.drawImage(sprite, x + width, y, x, y + height, u, 0, u + sprite.getWidth() / frameCount, sprite.getHeight(), null);
        } else {
            g2.drawImage(sprite, x, y, x + width, y + height, u, 0, u + sprite.getWidth() / frameCount, sprite.getHeight(), null);
        }
    }
}
