package mar_26A;

import java.io.FileReader;
import java.io.FileWriter;

public class ClassA 
{
  void fileOperation1() throws Exception 
  {
	  System.out.println("Reading the Data");
	  FileReader fr=new FileReader("C:\\Users\\user\\Documents\\ABCD.png");
	  System.out.println("Connection Created");
	  int i;
	  while((i=fr.read())!=-1)
	  {
		  System.out.println((char)i);
	  }
	  System.out.println();
	  System.out.println("Data Reterived");
	  fr.close();
  }
  void  fileOperation2()throws Exception
  {
	  System.out.println("writing data into a file");
	  FileWriter fw=new  FileWriter("C:\\Users\\user\\Documents\\ABCD.png",true);
	  String msg="MISSION SUCCESS";
	  fw.write(msg);
	  System.out.println("Data Entered");
	  fw.close();
	  
  }
  void fileOperation3()throws Exception
  {
	  System.out.println("Coping data into a file");
	  FileReader fr=new FileReader("C:\\Users\\user\\Downloads\\download (1).jpeg");
	  FileWriter fw=new  FileWriter("C:\\Users\\user\\Downloads\\download.jpeg");
	  System.out.println("Connection Created");
	  int i;
	  while((i=fr.read())!=-1);
	  {
		  fw.write(i);
	  }
	  System.out.println("Data Copied");
	  fr.close();
	  fw.close();
  }
  public static void main(String[] args)throws Exception {
	ClassA S=new ClassA();
	S.fileOperation1();
	S.fileOperation2();
	S.fileOperation3();
}
}
