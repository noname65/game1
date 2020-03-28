package game1;

import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
class Window_Selectable extends Window {

    Window_Selectable() {
    }

    public BufferedImage content() {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        bufferedImage = g2d.getDeviceConfiguration().createCompatibleImage(640, 480, Transparency.TRANSLUCENT);
        g2d = bufferedImage.createGraphics();
        g2d.dispose();
        return bufferedImage;
    }
    public volatile transient int index;
    public volatile transient int item_max;
    public volatile transient int column_max;
    public volatile transient String[] item;
}
