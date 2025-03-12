package file_handling_examples;

import java.io.File;

public class TestFileHandling 
{
	public static void main(String[] args) {
		File file = new File("");
		System.out.println(file.canRead());
		System.out.println(file.canExecute());
	}
}
