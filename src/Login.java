import java.util.Scanner; // I use scanner because it's command line.

public class Login {

	public void run() {
	    Scanner scan = new Scanner (new File("the\\dir\\myFile.extension"));
	    Scanner keyboard = new Scanner (System.in);
	    String user = scan.nextLine();
	    String pass = scan.nextLine(); // looks at selected file in scan

	    String inpUser = keyboard.nextLine();
	    String inpPass = keyboard.nextLine(); // gets input from user

	    if (inpUser.equals(user) && inpPass.equals(pass)) {
	        System.out.print("Welcome to the Best HOUSE");
	    } else {
	        System.out.print("Username and password do not match");
	    }
	}
	} 
}
