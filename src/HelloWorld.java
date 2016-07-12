import java.util.*;
import java.net.*;
import java.io.*;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		URL yahoo = new URL("https://www.baidu.com/");
		BufferedReader in = new BufferedReader(new InputStreamReader(yahoo.openStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		}
		in.close();
	}

}
