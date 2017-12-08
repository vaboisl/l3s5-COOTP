package l3miage17.vaboisantonelli.plugins;

import javax.swing.JFrame;

import l3miage17.vaboisantonelli.plugins.ui.*;

public class GuiLauncher {
	
	public static void main(String[] args) {
		
		UserInterface gui = new InformationUi();
		gui.setWindowTitle("Test");
		gui.prepareWindow();
		gui.showWindow();
	}
}
