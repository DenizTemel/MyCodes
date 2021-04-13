package CryptoProgram;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CyrptoProgram {
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.print("Enter your message:");
		
		Scanner nani = new Scanner(System.in);
		String mesaj = nani.nextLine();
		
		System.out.print("Name of the sender:");
		String sender = nani.nextLine();
        
		System.out.print("Name of the reveiver:");
		String receiver = nani.nextLine();
		
		// new scanner for integer
		Scanner lanetint = new Scanner(System.in);
		System.out.print("Type number of message:");
		int ID= lanetint.nextInt();
	
		nani.close();
		lanetint.close();
		
		//Created an object
       Message metin = new Message(ID,sender);
       // atamasyon
       metin.setMessage(mesaj);
       metin.setReceiver(receiver);
       metin.create_secret_key();
       metin.encrypt_message();
       
       System.out.println("Your message is:"+metin.getPrivateMessage());
       System.out.println("\n");
       metin.save_message();
       metin.show_message();
	}
}
