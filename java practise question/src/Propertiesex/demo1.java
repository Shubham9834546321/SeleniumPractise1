package Propertiesex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream e1 =new FileInputStream("C:\\Automation\\code\\java practise question\\PropertyFiles\\data.properties");
	Properties prop=new Properties();
	//prop.getProperty("username");
	prop.load(e1);
	System.out.println(prop.get("password"));
	String pAmount=prop.getProperty("roll");
	System.out.println(pAmount);
	int roll=Integer.parseInt(pAmount);
	int res=roll*10;
	System.out.println(res);
	prop.setProperty("mo", "9834655995");
	FileOutputStream f1=new FileOutputStream("C:\\Automation\\code\\java practise question\\PropertyFiles\\data.properties");
	prop.store(f1, "add mobile number");
	f1.close();
	System.out.println("updated");
	}

}
