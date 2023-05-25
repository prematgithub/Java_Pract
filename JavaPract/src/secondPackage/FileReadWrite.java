package secondPackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileReadWrite {

	public static void main(String[] args) throws Exception {
		// reading source file
		FileInputStream src = new FileInputStream("C:\\Study\\Job application\\headline.txt");

		BufferedInputStream bis =new BufferedInputStream(src);
		// writing into destination file
		FileOutputStream dest = new FileOutputStream("C:\\Study\\writer.txt");
		BufferedOutputStream bos= new BufferedOutputStream(dest);
		int info;
		while ((info=bis.read() )!= -1) {
			//info = bis.read();
			System.out.print((char)info);
			bos.write(info);
		}
		bis.close();
		bos.close();

	}

}
