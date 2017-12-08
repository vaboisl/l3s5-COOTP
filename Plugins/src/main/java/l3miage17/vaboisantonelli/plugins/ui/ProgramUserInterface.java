package l3miage17.vaboisantonelli.plugins.ui;

import javax.swing.JFrame;

public class ProgramUserInterface {
	JFrame window;
    
	public ProgramUserInterface() {
		window =  new JFrame();
		
		
	}
	
	public void setWindowTitle(String pTitle) {
		window.setTitle(pTitle);
	}
	
	public void prepareLaunchedWindow() {
		window.setSize(800,600);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void createProgramMenu() {
		
	}
	
	
	public void showWindow() {
		window.setVisible(true);
	}

       
}
