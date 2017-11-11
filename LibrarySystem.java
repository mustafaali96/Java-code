import java.util.Scanner;


public class LibrarySystem {

	public static void main(String[] args) {
		
		int MAX_BOOK_NUMBER = 10;
		int MAX_USER_NUMBER = 6; 
			
		Book[] BookLst = new Book[MAX_BOOK_NUMBER];
		User[] UserLst = new User[MAX_USER_NUMBER];
			
		System.out.println(" **** Library System ****");
		System.out.println("1: Add Books");
		System.out.println("2: Add User");
		System.out.println("3: Display Books");
		System.out.println("4: Display User");
		System.out.println("5: Display Borrow Books");
		System.out.println("6: Return Books");
		
		System.out.print("Select any option:");
		Scanner scan = new Scanner(System.in);		
		int inp = scan.nextInt();				
				
		switch(inp) {
        case 1 :    		
        	Book.addBooks();
           break;
           
        case 2 :
        	User.addUsers();
        	break;
        
        case 3 :
        	Book.displayBooks();
           break;

        case 4 :
        	User.displayUsers();
            break;
            
        case 5 :
        	Utility.borrowBooks();
            break;

        case 6 :
            Utility.returnBooks();
            break; 
            
        default :
           System.out.println("Invalid input");
     }

	}
	
	
	
}
