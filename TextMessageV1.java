/* 
 * Name: Pranshu Suri
 * Date: 12-31-15
 * Purpose of Program: To use various String methods in order to replace specific phrases and calculate the lengths of strings
 */

public class TextMessageV1 {

	public static void main(String[] args) {
		
		String message = "i don't know, but to be honest, in my opinion, coding is very fun because it's about learning and creating with your imagination.";
		
		String newMessage = message.replace("i don't know", "idk");
		newMessage = newMessage.replace("to be honest", "tbh");
		newMessage = newMessage.replace("in my opinion", "imo");
		newMessage = newMessage.replace("very", "v");
		newMessage = newMessage.replace("because", "bc");
		newMessage = newMessage.replace("about", "ab");
		newMessage = newMessage.replace("with", "w");
		newMessage = newMessage.replace("your", "ur");
		
		int messageLength = message.length();
		int newMessageLength = newMessage.length();
		
		System.out.println("Original Message:");
		System.out.println("  " + message);
		System.out.println("  message length: " + messageLength + " characters\n");
		
		System.out.println("New Message:");
		System.out.println("  " + newMessage);
		System.out.println("  message length: " + newMessageLength + " characters");
		
	}

}
