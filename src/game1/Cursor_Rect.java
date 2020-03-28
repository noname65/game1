package game1;
class Cursor_Rect {
    
    public volatile transient int width;
    public volatile transient int height;
    public volatile transient String windowskin;

    Cursor_Rect(int width, int height) {
        this.width = width;
        this.height = height;
        windowskin = Game_System.windowskin_name;
    }
}
