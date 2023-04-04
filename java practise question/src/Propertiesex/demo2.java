package Propertiesex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class demo2 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Automation\\code\\java practise question\\PropertyFiles\\shubh.properties");
Properties p1=new Properties();
p1.load(fis);
System.out.println(p1.getProperty("age"));
System.out.println(p1.getProperty("salary"));
String s1=p1.getProperty("salary");
System.out.println(s1);
int salary=Integer.parseInt(s1);
int res=salary/5;
System.out.println(res);
p1.setProperty("vehicle", "car");
FileOutputStream fos=new FileOutputStream("C:\\Automation\\code\\java practise question\\PropertyFiles\\shubh.properties");
p1.store(fos, "Add vehical");
fos.close();
System.out.println("sucessfully updated");

}
}