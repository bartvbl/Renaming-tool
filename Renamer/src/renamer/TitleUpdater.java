package renamer;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

public class TitleUpdater implements KeyListener {

	private Renamer main;

	public TitleUpdater(Renamer renamer) {
		this.main = renamer;
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("renaming" + new File(this.main.selectedFile.getAbsolutePath()).getName());
		File file = new File(new File(this.main.selectedFile.getPath()).getParentFile().getPath() + "\\" + RenamerView.renamePane.getText());
		System.out.println(RenamerView.renamePane.getText());
		System.out.println(this.main.selectedFile.renameTo(file));
		TreeMember member = (TreeMember) this.main.mutable.getUserObject();
		member.file = file;
		this.main.selectedFile = file;
		System.out.println(file.getAbsolutePath());
		RenamerView.fileTree.validate();

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

}
