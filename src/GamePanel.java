import java.awt.Font;
import java.util.Timer;

import javax.swing.JPanel;

public class GamePanel {
JPanel panel = new JPanel();
final int MENU = 0;
final int GAME = 1;
final int END = 2;
int currentState = MENU;
Font titleFont;
Font somethingFont;
Timer frameDraw;
Rocketship r = new Rocketship();
ObjectManager om = new ObjectManager();
GamePanel(){
titleFont = new Font("Arial" Font.PLAIN,48);
somethingFont = new Font

}
}
