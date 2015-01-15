/**
 * @(#)AppletMenu.java
 *
 * AppletMenu Applet application
 *
 * @author
 * @version 1.00 2012/8/26
 */

import java.awt.*;
import java.applet.*;

public class AppletMenu extends Applet {

	public void init() {
		Frame frame = new menu();
		frame.resize(250,250);
		frame.show();
	}

	public void paint(Graphics g) {

		//g.drawString("Welcome to Java!!", 50, 60 );

	}
}