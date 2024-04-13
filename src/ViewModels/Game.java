package ViewModels;

public class Game {

    // Screen Settings
    public final static int originalTileSize = 32; // 32x32 tile (pixels)
    public final static int scale = 2;
    public final static int tileSize = originalTileSize * scale; // 64x64 tile (pixels)

    public final static int maxScreenColumns = 29;
    public final static int maxScreenRows = 15;
    public final static int screenWidth = tileSize * maxScreenColumns; // 64x29 = 1856 pixels
    public final static int screenHeight = tileSize * maxScreenRows; // 64x15 = 960 pixels
}
