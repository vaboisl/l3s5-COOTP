/**
 * 
 */
package l3miage17.vaboisantonelli.plugins.observer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author vabois
 *
 */
public class FileUpdateActor implements FileListener, ActionListener {
	protected FileChecker checker;
	
	public FileUpdateActor (FileChecker pChecker) {
		this.checker = pChecker;
	}
	
	public void fileAdded (FileEvent pEvent) {
		System.out.println("this one has been detected");
	}
	
	public void actionPerformed (ActionEvent pActionEvent) {
		System.out.println("graphic modifs here...");
	}
	
}
