package CryptoProgram;

import java.io.*;
import java.util.Random;

public class Message {
	public int ID;
	public String sender, receiver, message;
	public String privateMessage = "";
	public int secretKey;

	// Created constructor ( name should be same with the class name)
	public Message(int ID, String sender) {
		this.ID = ID;
		this.sender = sender;

	}

	// Getters and setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPrivateMessage() {
		return privateMessage;
	}

	public void setPrivateMessage(String privateMessage) {
		this.privateMessage = privateMessage;
	}

	public int getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(int secretKey) {
		this.secretKey = secretKey;
	}

	// Created secret key = Generate a random integer between 0-10 and assign the
	// secretKey value.

	public void create_secret_key() {
		Random rand = new Random();
		this.secretKey = rand.nextInt(10) + 1;

	}

	// Encrypted the message
	public void encrypt_message() {
		for (int i = 0; i < this.message.length(); i++) {
			char karakter = this.message.charAt(i);
			// += eşitle demek değil ekle demek
			this.privateMessage += (char) (karakter + this.secretKey);

		}
	}

	// Saved the message = Save the message and all properties as ".txt" file
	public void save_message() throws FileNotFoundException {
		PrintStream myfile = new PrintStream(new File("MyPerfectCode.txt"));
		myfile.println("Sender:" + this.sender + "\n" + "Receiver:" + this.receiver + "\n" + "Number of the message:"
				+ this.ID + "\n" + "Your message:" + this.message + "\n" + "Message you received:" + this.privateMessage
				+ "\n" + "Choosed secret key is:" + this.secretKey);
	}

	// Showed the message = Print the message and all properties to the console
	public void show_message() {

		System.out.print("Sender:" + this.sender + "\n" + "Receiver:" + this.receiver + "\n" + "Number of the message:"
				+ this.ID + "\n" + "Your message:" + this.message + "\n" + "Message you received:" + this.privateMessage
				+ "\n" + "Choosed secret key is:" + this.secretKey);
	}

}