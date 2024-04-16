package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class docFile {
	public static void main(String[] args) {
		try {
			File file = new File("output.data");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			for (int i=0; i<2; ++i) {
				SinhVien sv = (SinhVien) ois.readObject();
				System.out.println(sv);
			}
			ois.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
