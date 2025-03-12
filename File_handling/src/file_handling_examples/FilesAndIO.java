package file_handling_examples;


import java.io.File;
import java.io.IOException;
import java.rmi.AccessException;

public class FilesAndIO {
	public static void main(String[] args) throws IOException {
		int i = System.in.read();
		System.out.println(i);
	}
}