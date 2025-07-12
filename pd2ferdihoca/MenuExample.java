package pd2ferdihoca;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExample {

    public MenuExample() {
        JFrame f = new JFrame("Menu Example");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenu submenu = new JMenu("Sub Menu");
        JMenuItem l1 = new JMenuItem("Item 1");
        JMenuItem l2 = new JMenuItem("Item 2");
        JMenuItem l3 = new JMenuItem("Item 3");
        JMenuItem l4 = new JMenuItem("Item 4");
        JMenuItem l5 = new JMenuItem("Item 5");

        menu.add(l1);
        menu.add(l2);
        menu.add(l3);
        submenu.add(l4);
        submenu.add(l5);
        menu.add(submenu);
        mb.add(menu);

        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {

        new MenuExample();

    }
}
