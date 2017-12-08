package l3miage17.vaboisantonelli.plugins.ui;

import javax.swing.JFrame;

public class InformationUi extends UserInterface {

	public InformationUi() {
		super();
	}
	
	public void prepareWindow() {
		window.setSize(800,150);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
