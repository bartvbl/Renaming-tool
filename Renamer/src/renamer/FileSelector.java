package renamer;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class FileSelector implements TreeSelectionListener {

	private Renamer main;

	public FileSelector(Renamer renamer) {
		this.main = renamer;
	}

	@Override
	public void valueChanged(TreeSelectionEvent event) {
		TreeMember node = (TreeMember) ((DefaultMutableTreeNode) event.getPath().getLastPathComponent()).getUserObject();
		RenamerView.renamePane.setText(node.file.getName());
		this.main.selectedFile = node.file;
		this.main.mutable = (DefaultMutableTreeNode) event.getPath().getLastPathComponent();
	}

}
