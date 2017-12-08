package l3miage17.vaboisantonelli.plugins.ui;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class PrincipalUi extends UserInterface{

	JMenuBar theMenu = new JMenuBar();
	
	public PrincipalUi() {
		super();
		theMenu = new JMenuBar();
	}
	
	public void prepareWindow() {
		window.setSize(800,600);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
