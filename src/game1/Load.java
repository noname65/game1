package game1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
class Load {

    Load() {
        int a = 0;
        list2[0] = null;
        for (int i = 0; i < list1.length; i++) {
            if (".csv".equals(list1[i].substring(list1[i].length() - 4, list1[i].length()))) {
                list2[a] = list1[i];
                a++;
            }
        }
        if (list2[0] == null) {
            list2[0] = Game_System.got_text(8, new String[9999]);
        }
        window = new JFrame(Game_System.got_text(2, new String[9999]));
        window.setSize(640 + 16, 480 + 38); //设置窗口大小
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗口关闭程序就停止
        window.setLocationRelativeTo(null); //设置居中
        window.setResizable(false); //设置窗口不可拉伸改变大小
        jButton1 = new JButton(Game_System.got_text(5, new String[9999]));
        jButton2 = new JButton(Game_System.got_text(7, new String[9999]));
        jButton3 = new JButton(Game_System.got_text(6, new String[9999]));
        jList1 = new JList<>(list2);
        jScrollPane1 = new JScrollPane(jList1);
        //jScrollPane1.setViewportView(jList1);
        jButton1.setBounds(480, 0, 160, 30);
        jButton2.setBounds(480, 30, 160, 30);
        jButton3.setBounds(480, 60, 160, 30);
        jList1.setBounds(0, 0, 460, 480);
        jScrollPane1.setBounds(460, 0, 20, 480);
        window.add(jButton1);
        window.add(jButton2);
        window.add(jButton3);
        window.add(jList1);
        window.add(jScrollPane1);
        Game_System.jLabel = new JLabel("");
        Game_System.jLabel.setBounds(0, 0, 1, 1);
        window.add(Game_System.jLabel);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Determine(evt);
            }
        });
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Refresh(evt);
            }
        });
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Back(evt);
            }
        });
        window.setVisible(true);
    }

    private void Determine(ActionEvent e) {
        if (jList1.getAnchorSelectionIndex() != -1) {
            if (!(Game_System.got_text(8, new String[99]).equals(list2[jList1.getAnchorSelectionIndex()])) && list2[jList1.getAnchorSelectionIndex()] != null) {
                System.out.print(new File(Game_System.directory + "/Save/" + list2[jList1.getAnchorSelectionIndex()]));
            }
        }
    }

    private void Refresh(ActionEvent e) {
        list1 = new File(Game_System.directory + "/Save").list();
        int a = 0;
        list2[0] = null;
        for (int i = 0; i < list1.length; i++) {
            if (".csv".equals(list1[i].substring(list1[i].length() - 4, list1[i].length()))) {
                list2[a] = list1[i];
                a++;
            }
        }
        if (list2[0] == null) {
            list2[0] = Game_System.got_text(8, new String[9999]);
        }
        jList1.setListData(list2);
    }

    private void Back(ActionEvent e) {
        if ("Title".equals(Game_System.back)) {
            window.setVisible(false);
            new Title().setVisible(true);
        }
    }
    public volatile transient String[] list1 = new File(Game_System.directory + "/Save").list();
    public volatile transient String[] list2 = new String[9999];
    private volatile transient JList<String> jList1;
    private volatile transient JScrollPane jScrollPane1;
    private volatile transient JButton jButton1;
    private volatile transient JButton jButton2;
    private volatile transient JButton jButton3;
    private volatile transient JFrame window;
}
