package game1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
class Title extends JFrame {

    Title() {
        super(Game_System.got_text(0, new String[9999]));
        int width = 640;
        int height = 480;
        int x = 100;
        int y = 200;
        int yy = 30;
        int xx = 200;
        int yyy = 70;
        setBackground(Color.black);
        setSize(width + 16, height + 38); //设置窗口大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗口关闭程序就停止
        setResizable(false); //设置窗口不可移动
        setLocationRelativeTo(null); //设置居中
        setResizable(false); //设置窗口不可拉伸改变大小
        jButton1 = new JButton(Game_System.got_text(1, new String[9999]));
        jButton2 = new JButton(Game_System.got_text(2, new String[9999]));
        jButton3 = new JButton(Game_System.got_text(3, new String[9999]));
        jButton4 = new JButton(Game_System.got_text(4, new String[9999]));
        jLabel1 = new JLabel(Game_System.got_text(0, new String[9999]));
        jLabel2 = new JLabel(new ImageIcon(Game_System.directory + "/Graphics/Titles/标题.jpg"));
        jLabel1.setFont(new Font(jLabel1.getFont().toString(), Font.BOLD, 60));
        jLabel1.setForeground(Color.yellow);
        jButton1.setBounds((width - x) / 2, y + yy * 0, x, yy);
        jButton2.setBounds((width - x) / 2, y + yy * 1, x, yy);
        jButton3.setBounds((width - x) / 2, y + yy * 2, x, yy);
        jButton4.setBounds((width - x) / 2, y + yy * 3, x, yy);
        jLabel1.setBounds((width - xx) / 2, y - yyy, xx, yyy);
        jLabel2.setBounds(0, 0, 640, 480);
        add(jButton1);
        add(jButton2);
        add(jButton3);
        add(jButton4);
        add(jLabel1);
        add(jLabel2);
        Game_System.jLabel = new JLabel("");
        Game_System.jLabel.setBounds(0, 0, 1, 1);
        add(Game_System.jLabel);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Start(evt);
            }
        });
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Load(evt);
            }
        });
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Settings(evt);
            }
        });
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Exit(evt);
            }
        });
        setVisible(true);
    }

    private void Start(ActionEvent e) {
        Game_System.initialize();
        setVisible(false);
        Game_System.Map.Main();
    }

    private void Load(ActionEvent e) {
        Game_System.back = "Title";
        setVisible(false);
        new Load();
    }

    private void Settings(ActionEvent e) {
    }

    private void Exit(ActionEvent e) {
        System.exit(0);
    }

    public void set_Visible(boolean a) {
        setVisible(a);
    }
    public volatile transient JButton jButton1;
    public volatile transient JButton jButton2;
    public volatile transient JButton jButton3;
    public volatile transient JButton jButton4;
    public volatile transient JLabel jLabel1;
    public volatile transient JLabel jLabel2;
}
