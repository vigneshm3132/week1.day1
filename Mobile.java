package week1.day1;

public class Mobile {

	public void sendMsg()
	{
		System.out.println("Send SMS");
	}
	
	public void makeCall()
	{
	System.out.println("Make a Call");
	}
	public void saveContact()
	{
	System.out.println("Save a Contact");
	}
	
	public static void main(String[] args) {
	
		Mobile object = new Mobile();
		object.sendMsg();
		object.makeCall();
		object.saveContact();
				
	}
	
}
