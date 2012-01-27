package renamer;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
public class TreeBuilder {

	public static void buildTree(File file) {
		JTree treeToBuild = RenamerView.fileTree;
		DefaultMutableTreeNode root = new DefaultMutableTreeNode(new TreeMember(file));
		treeToBuild.setModel(new DefaultTreeModel(root));
		findChildNodes(root);
		treeToBuild.expandRow(0);
	}
	private static void findChildNodes(DefaultMutableTreeNode node) 
	{
		TreeMember parentNode = (TreeMember) node.getUserObject();
		File[] files = parentNode.file.listFiles();
		for(File file : files)
		{
			DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(new TreeMember(file));
			if(file.isDirectory())
			{
				findChildNodes(newNode);					
			}
			node.add(newNode);
		}	
	}

}
