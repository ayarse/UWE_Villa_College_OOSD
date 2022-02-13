package examq2;

import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Ayas Nasih - S1600655
 */
public class ExamQ2 {

    public static void main(String[] args) {
        // Initialize form (JFrame) and menu bar
        JFrame form = new JFrame();
        JMenuBar menu = new JMenuBar();

        // Set a title, size, close operation, and center startup position to JFrame
        form.setTitle("OOSD2 Exam Section A - Question 2");
        form.setSize(500, 400);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);

        // Create Edit menu and its subitems
        JMenu editMenu = new JMenu("Edit");
        JMenuItem undoMenuItem = new JMenuItem("Undo");
        JMenuItem redoMenuItem = new JMenuItem("Redo");
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");

        // Map all the menus to their respective icons
        HashMap<JMenuItem, ImageIcon> menuIcons = new HashMap<>();
        menuIcons.put(undoMenuItem, new ImageIcon("res/icons/undo.png"));
        menuIcons.put(redoMenuItem, new ImageIcon("res/icons/redo.png"));
        menuIcons.put(cutMenuItem, new ImageIcon("res/icons/cut.png"));
        menuIcons.put(copyMenuItem, new ImageIcon("res/icons/copy.png"));
        menuIcons.put(pasteMenuItem, new ImageIcon("res/icons/paste.png"));

        // Iterate over the map to set icon for each menu item
        menuIcons.forEach((menuItem, menuIcon) -> {
            menuItem.setIcon(menuIcon);
        });

        // Add submenus to Edit menu, and other menu's to the main Menu
        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        menu.add(new JMenu("File"));
        menu.add(editMenu);
        menu.add(new JMenu("Search"));

        // Display the form
        form.setJMenuBar(menu);
        form.setVisible(true);
    }

}
