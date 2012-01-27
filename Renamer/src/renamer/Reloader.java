package renamer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reloader implements ActionListener {

	private Renamer renamer;

	public Reloader(Renamer renamer) {
		this.renamer = renamer;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		TreeBuilder.buildTree(this.renamer.rootFile);
	}

}
