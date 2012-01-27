package renamer;

import java.io.File;

import javax.swing.tree.DefaultMutableTreeNode;

public class Renamer {
	public File selectedFile;
	public File rootFile;
	public DefaultMutableTreeNode mutable;

	public Renamer()
	{
		RenamerView.openItem.addActionListener(new FileOpener(this));
		RenamerView.fileTree.addTreeSelectionListener(new FileSelector(this));
		RenamerView.renamePane.addKeyListener(new TitleUpdater(this));
		RenamerView.upButton.addActionListener(new Reloader(this));
	}
}
