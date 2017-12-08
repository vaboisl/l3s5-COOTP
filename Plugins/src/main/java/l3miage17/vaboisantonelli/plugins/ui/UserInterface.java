package l3miage17.vaboisantonelli.plugins.ui;

import javax.swing.JFrame;

public abstract class UserInterface {
	protected JFrame window;
	
	public UserInterface()
	{
		window =  new JFrame();
	}
	
	public void setWindowTitle(String pTitle) {
		window.setTitle(pTitle);
	}
	
	public abstract void prepareWindow();
	
	public void showWindow() {
		window.setVisible(true);
	}
}
