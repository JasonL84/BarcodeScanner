import gnu.io.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws PortInUseException, IOException {
		RXTXPort c = new RXTXPort("COM3") ;
		DataInputStream br = new DataInputStream(c.getInputStream());
		while(true) {
			String s = br.readLine();
			if(s!=null) {
				System.out.println(s);
			}
		}
	}

}
