package mar_20;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassA 
{
  void fileOperations() throws Exception
  {
	  System.out.println("Implementing Data Streams ");
	  DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\Users\\user\\Documents\\ABCD.png"));
	   System.out.println("Connection Created");
	  
	   dos.writeInt(1000);
	   dos.writeChar('A');
	   dos.writeBoolean(true);
	   dos.writeInt(2000);
	   System.out.println("Data Entered Securely ");
	   dos.close();
	   
	   System.out.println("\nReading the data from file ");
	   DataInputStream dis=new DataInputStream(new FileInputStream("C:\\Users\\user\\Documents\\ABCD.png"));
	   System.out.println("Connection created securely");
	   
	   System.out.println("\n"+dis.readInt());
	   System.out.println(dis.readChar());
	   System.out.println(dis.readBoolean());
	   System.out.println(dis.readInt());
	   
	   System.out.println(" Data reterived ");
	   dis.close();
  }
  public static void main(String[] args)throws Exception {
	ClassA A=new ClassA();
	A.fileOperations();
}
}
