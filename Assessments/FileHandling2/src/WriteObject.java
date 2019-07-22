import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("kavya");
		p.setId(14);
		try {
			FileOutputStream fout = new FileOutputStream("sourabh.txt");
			ObjectOutputStream objOut = new ObjectOutputStream(fout);
			objOut.writeObject(p);
			objOut.close();
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
