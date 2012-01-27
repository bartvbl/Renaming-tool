package renamer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

public class FileOpener implements ActionListener {
	
	private Renamer main;

	public FileOpener(Renamer renamer) {
		this.main = renamer;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fc.showOpenDialog(null);
		File file = fc.getSelectedFile();
		TreeBuilder.buildTree(file);
		this.main.rootFile = file;
	}

}
