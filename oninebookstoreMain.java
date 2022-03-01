package onlneBookshop;

import java.util.Scanner;
import onlneBookshop.RegMember;
import LoginSignUp.UserDetails;

public class oninebookstoreMain {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberDetails member = new MemberDetails();
		AddBook book =new AddBook();
		RegMember reg =new RegMember();
		char choice; 

	{
		do {
			System.out.println("1 - login");
			System.out.println("2-  Register for book");
			System.out.println("3 - Enter Book ");			
			System.out.println("4 - verification");					
			System.out.println("0 - Exit");
            
			int option = scanner.nextInt();

            switch(option) {
            case 1:
            	member.addInList();
            	break;
            case 2:            	
            	reg.addMember();
            case 3:
            	book.addbook();
            	break;
            
            case 4:
            	member.Verification();
            	break;
            case 5:
            	break;
            }
		
			System.out.println("want more operation?(y/n)");
		choice = scanner.next().charAt(0);					
		}while((choice == 'y')||(choice=='n'));
		
		
	}
	}
}

	


