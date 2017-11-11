import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class User {
	public String Name;
	public String Type;
	public String StudentNumber;
	public String Faculty;
	public int BorrowedBooks ;	
	public int MAX_BORROWED_BOOKS;

public static void addUsers(){	
		
		User UserIns = new User();

		System.out.print("Enter user Name");
		Scanner scanName = new Scanner(System.in);		
		UserIns.Name = scanName.next();
		
		System.out.print("Enter User Type");
		Scanner scanType = new Scanner(System.in);		
		UserIns.Type = scanType.next().toLowerCase();
		
		if(UserIns.Type.compareTo("student") == 0)
		{
			System.out.print("Enter Student Number");
			Scanner scanStdNum = new Scanner(System.in);		
			UserIns.StudentNumber = scanStdNum.next();
			UserIns.MAX_BORROWED_BOOKS = 2;
		}
		else if(UserIns.Type.compareTo("professor") == 0)
		{
			System.out.print("Enter Faculty");
			Scanner scanStdFac = new Scanner(System.in);		
			UserIns.Faculty = scanStdFac.next();
			UserIns.MAX_BORROWED_BOOKS = 5;
		}
		else{
			System.out.print("Invalid user type.You can type student or professor only. Please re enter\n\n");
			addUsers();			
		}
		
		if(UserIns.Type.compareTo("student") == 0 || UserIns.Type.compareTo("professor") == 0)
		{
		BufferedWriter writer = null;
		try 
		{
		    writer = new BufferedWriter( new FileWriter( "H:/LibraryFiles/Users.txt",true));
		    writer.write(""+UserIns.Type+",   "+UserIns.Name+",       "+UserIns.StudentNumber+",        "+UserIns.Faculty+",           "+UserIns.MAX_BORROWED_BOOKS+"\r\n");
		    System.out.println("User added successfully");
		}
		catch ( IOException e)
		{
		}
		finally
		{
		    try
		    {
		        if ( writer != null)
		        writer.close( );
		    }
		    catch ( IOException e)
		    {
		    }
		}		
		
		}	
	}
	
public static void displayUsers(){
	
	BufferedReader br = null;

	try {

		String sCurrentLine;

		br = new BufferedReader(new FileReader("H:/LibraryFiles/Users.txt"));

		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}

	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			if (br != null)br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

} 

}
