package exam_7_2_24;

import java.io.FileInputStream;

public class ReadFileContent {

	public static void main(String[] args) throws Exception {
		var fin = new FileInputStream("D:\\JAVA27\\file1.txt");

		try (fin) {
			int i;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
