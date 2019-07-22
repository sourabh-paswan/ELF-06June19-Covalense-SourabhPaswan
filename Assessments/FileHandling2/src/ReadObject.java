import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) {
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try {
			fin = new FileInputStream("sourabh.txt");
			oin = new ObjectInputStream(fin);
			Person p = (Person) oin.readObject();
			System.out.println("name is " + p.getName());
			System.out.println("ID is " + p.getId());
			//oin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oin != null) {
				try {
					oin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
