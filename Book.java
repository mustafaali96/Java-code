import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

 
public class Book {
	
	public String Title;
	public String Author;
	public String PublicationYear;
	public String Borrower;
	
	public static void addBooks(){	

		Book BookIns = new Book();	//created instance of Book class
		
		System.out.print("Enter Book Title");
		Scanner scan = new Scanner(System.in);		
		BookIns.Title = scan.next();
		
		System.out.print("Enter Book Author");
		Scanner scanAuthur = new Scanner(System.in);		
		BookIns.Author = scanAuthur.next();
		
		System.out.print("Enter Book Publication year");
		Scanner scanPublisher = new Scanner(System.in);		
		BookIns.PublicationYear = scanPublisher.next();
		
		BufferedWriter writer = null;
		try
		{
			writer = new BufferedWriter( new FileWriter( "H:/LibraryFiles/Books.txt",true));
		    writer.write(BookIns.Title+", "+BookIns.Author+", "+BookIns.PublicationYear+"\r\n");
		    System.out.println("Book added successfully");
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
		//save in text file
		
	}
	public static void displayBooks(){
		
		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("H:/LibraryFiles/Books.txt"));

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
