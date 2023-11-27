import java.applet.Applet;
import java.awt.*;
import java.util.Date;
public class applet2 extends Applet {
    public void paint(Graphics g){
        Date currentdate = new Date();
        String date = currentdate.toString();   
        g.setColor(getBackground().BLACK);
        g.setFont(new Font("Arial",Font.BOLD,16));
        g.drawString("System time : "+date,20,50);
    }
}

/*
* <applet code="applet1.class" width="1000" height="1000"></applet>
*/
