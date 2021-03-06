package game1;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.JLabel;
class Game_System {
    public transient static float Cursor_Rect = 1.00f;
    public transient static int language = 1;
    public transient static int actor_id = 0;
    public transient static int speed = 3;
    public transient static int frequency = 9;
    public transient static String directory = new File("").getAbsolutePath();
    public transient static String panoramas = directory + "/Graphics/Panoramas";
    public transient static String tilesets = directory + "/Graphics/Tilesets/";
    public transient static String characters = directory + "/Graphics/Characters/";
    public transient static String data = directory + "/Data/";
    public transient static String windowskin_name = "001-Blue01.png";
    public transient static String back = "";
    public transient static String windowskins = directory + "/Graphics/Windowskins/";
    public transient static Color normal_color = new Color(255, 255, 255, 255);
    public transient static Font font = new Font("Microsoft YaHei", Font.PLAIN, 24);
    public transient static JLabel jLabel;
    public transient static Map Map = new Map();
    public transient static Actor[] actor = new Actor[1];
    public transient static Event Event = new Event();
    public transient static Event[][] event = new Event[999][99];
    public transient static boolean[] Switches = new boolean[9999];
    public transient static Object[] Variables = new Object[9999];
    public transient static CommonEvent CommonEvent = new CommonEvent();
    public transient static Timer[] timer = new Timer[999];
    public transient static Window_Message Window_Message = new Window_Message(null);
    public static void initialize() {
        new Equip().initialize();
        Game_System.actor[0] = new Actor();
        Game_System.actor[0].icon = "001-Fighter01.png";
        Game_System.timer[1] = new Timer("move1", 0, 0, 0);
        Game_System.timer[1].start();
        for (int i = 0; i < Game_System.Variables.length; i++) {
            Game_System.Variables[i] = 0;
        }
        Game_System.Window_Message.setWindowType(0);
    }
    public static String got_text(int i, String[] text) {
        String s = "";
        int a = 0;
        String[][] text1 = new String[3][18];
        text1[1][a] = "标题";
        text1[2][a] = "Title";
        a = 1;
        text1[1][a] = "开始";
        text1[2][a] = "Start";
        a = 2;
        text1[1][a] = "读档";
        text1[2][a] = "Load";
        a = 3;
        text1[1][a] = "设置";
        text1[2][a] = "Settings";
        a = 4;
        text1[1][a] = "退出";
        text1[2][a] = "Exit";
        a = 5;
        text1[1][a] = "确定";
        text1[2][a] = "Determine";
        a = 6;
        text1[1][a] = "返回";
        text1[2][a] = "Back";
        a = 7;
        text1[1][a] = "刷新";
        text1[2][a] = "Refresh";
        a = 8;
        text1[1][a] = "没有存档";
        text1[2][a] = "No file";
        a = 9;
        text1[1][a] = "\n现在是星期几？\n";
        text1[2][a] = "\nWhat day is it now?\n";
        a = 10;
        text1[1][a] = "\n二十三天后是星期" + text[0] + "。\n";
        text1[2][a] = "\nIt's " + text[1] + " in 23 days.\n";
        a = 11;
        text1[1][a] = "\n砍掉他们的脑袋！\n";
        text1[2][a] = "\nOff with their head!\n";
        a = 12;
        text1[1][a] = "\n请输入一个数字：\n";
        text1[2][a] = "\nPlease enter a number:\n";
        a = 13;
        text1[1][a] = "\n这个数字";
        text1[2][a] = "\nThis number is ";
        a = 14;
        text1[1][a] = "\n输出随机数：" + (int) Math.ceil(Math.random() * 10) + "\n";
        text1[2][a] = "\nOutput random number:" + (int) Math.ceil(Math.random() * 10) + "\n";
        a = 15;
        text1[1][a] = "\n你是了不起的。\n";
        text1[2][a] = "\nYou are amazing.\n";
        a = 16;
        text1[1][a] = "\n请输入数字或输入完成(done)计算结果。\n";
        text1[2][a] = "\nPlease enter Numbers or enter done(完成) results.\n";
        a = 17;
        text1[1][a] = "\n你输入的不是已知命令。\n";
        text1[2][a] = "\nYou're not typing a known command.\n";
        return text1[language][i];
    }
}
