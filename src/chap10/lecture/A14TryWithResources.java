package chap10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A14TryWithResources {
	public static void main(String[] args) {
		String path = "src/chap10/lecture/A13TryWithResources.java";
		try (FileInputStream fis = new FileInputStream(path);) {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
		} finally {
			
		}
		
	}
}
