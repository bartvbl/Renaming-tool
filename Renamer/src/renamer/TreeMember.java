package renamer;

import java.io.File;

public class TreeMember {
	public File file;

	public TreeMember(File file)
	{
		this.file = file;
	}
	
	public String toString()
	{
		return this.file.getName();
	}
}
