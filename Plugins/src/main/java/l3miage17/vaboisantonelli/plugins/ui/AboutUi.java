package l3miage17.vaboisantonelli.plugins.ui;

import javax.swing.JFrame;

public class AboutUi extends UserInterface {
	
	public AboutUi() {
		super();
	}
	
	public void prepareWindow() {
		window.setSize(250,250);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
