package pd2ferdihoca;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExample2 {
    public MenuExample2() {
        JFrame f = new JFrame("Menu Example");
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");

        JMenuItem l1 = new JMenuItem("Item 1");
        JMenuItem l2 = new JMenuItem("Item 2");
        JMenuItem l3 = new JMenuItem("Item 3");
        JMenuItem l4 = new JMenuItem("Item 4");
        JMenuItem l5 = new JMenuItem("Item 5");
        JMenuItem l6 = new JMenuItem("Item 6");

        file.add(l1);
        file.add(l2);
        file.add(l3);
        edit.add(l4);
        edit.add(l5);
        view.add(l6); // view menüsüne bir öğe ekleniyor

        mb.add(file);
        mb.add(edit);
        mb.add(view); // view menüsü de ekleniyor

        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample2();
    }
}
