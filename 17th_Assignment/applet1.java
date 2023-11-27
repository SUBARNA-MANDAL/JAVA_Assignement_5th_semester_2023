import java.applet.Applet;
import java.awt.*;

public class applet1 extends Applet {
    public void paint (Graphics g){
        int x = 20;
        int y = 50;
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial",Font.BOLD,16));
        g.drawString("SUBARNA MANDAL", x, y);
    }
}
/*
* <applet code="applet1.class" width="1000" height="1000"></applet>
*/